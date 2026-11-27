# Armature

A design token engine with built-in accessibility checks, and the home of Brander's own design families.

In sculpture, the armature is the hidden frame under the clay. Every system built on it shapes its own surface; the armature keeps them standing the same way.

## Three layers, two kinds of owner

| Layer | What it owns | Where |
| --- | --- | --- |
| Engine | Role names (the contract), spacing, type scale, radius scale, motion durations, touch sizes, accessibility rules, the build and its contrast checks | `engine/` (MIT) |
| Owner | Signatures (maker's marks), foundation overrides, package name | `brander/owner.json` here; `client/owner.json` in a client repo |
| Family | Industry, palette, fonts, radius choice, type scale adjustments, light and dark themes, Android dynamic color policy | `<owner>/families/<family>/family.json` |
| App | Primary color, icon motif, small overrides | `<owner>/apps/<app>.json` |

- **Brander** is the owner layer for Guilherme's own projects (the company Brander in Governor). It lives in this repo with two families, which Governor registers as brands of Brander: Scriptorium (information science: Notekeeper, Herald, Tessera) and Health.

Name mapping with Governor: Armature owner = Governor party; Armature family = Governor family or brand; Armature app = Governor project.
- **Clients** are owners too, but each one lives in its own private repo created from [armature-client-template](https://github.com/guilnunes/armature-client-template). That repo carries a pinned copy of the engine, so a client system builds on its own and can be handed over without any dependency on this repo. Brander signatures never go into a client repo.

## Industries

`engine/industries.json` lists industries (health, finance, education, children, sports-fitness, information-science, commerce, arts-culture, public-service), each with:

- **Rules** the build enforces: minimum text contrast, minimum UI contrast, smallest text size, smallest touch target, allowed Android dynamic color policies.
- **Guidelines** that cannot be machine checked (for example "clinical values always carry their unit"), written to `<owner>/docs/industry-rules.md` and into `dist/tokens` for agents and reviewers.

A family declares one or more industries in `settings.industry` (for example `["health"]`). The strictest value across the engine, the owner and every declared industry wins, so declaring an industry can only raise the bar. Health asks for AAA text contrast (7:1) and 16px minimum text, so the Health family raises its caption size and darkens two colors to comply. A family may adjust its type scale, spacing or sizes in a `foundation` block, never the accessibility rules.

## Build

```
node engine/build.mjs brander          # validate, then generate brander/dist
node engine/build.mjs brander --check  # validate only
```

Zero dependencies, Node 18 or newer. The build fails if any text pair is below 4.5:1 or any control boundary below 3:1, and writes the full table to `<owner>/docs/contrast-report.md`. An owner can make the accessibility rules stricter, never looser.

## Outputs

| Platform | File | Use |
| --- | --- | --- |
| Web | `<owner>/dist/web/<target>.css` | `@import "tailwindcss";` then this file. shadcn/ui reads the variables as is |
| Android | `<owner>/dist/android/<target>/ArmatureTheme.kt` | Copy into the app module, wrap the UI in `ArmatureTheme { }`. Every Material 3 color slot is filled, so no default purple leaks in |
| iOS | `<owner>/dist/ios/<target>/Armature.swift` | Add to the Xcode target, use `Armature.primary` etc. |
| Agents, Figma | `<owner>/dist/tokens/<target>.json` | Flat resolved values |

## The contract

Every family must give a value, in light and dark, to each role in `engine/contract.json`. Role names follow shadcn/ui (`background`, `primary`, `muted-foreground`, `input`, `ring`...) plus `highlight`. Each role maps to a Material 3 slot and a SwiftUI property.

## Engine accessibility rules

- Body text 18px, smallest text 14px, sizes in sp and Dynamic Type so they follow the system font size.
- Layouts must survive 200% system font scale.
- Body text pairs target 7:1, every other text pair at least 4.5:1, control boundaries at least 3:1.
- Touch targets never below 48dp, 56dp by default.
- Reduced motion from the OS turns every animation off.
- Color never carries meaning alone.

## Brander signatures

Defined in `brander/owner.json`, shared by every Brander family, absent from client systems:

1. Focus ring: 3px solid, 2px offset.
2. The settle curve `cubic-bezier(0.2, 0, 0, 1)` on every enter and move.
3. The tick rule: a 1px divider ending in a small diamond in the highlight color, also at the top of every app icon.
4. Atkinson Hyperlegible as the interface face.

## Dynamic color (Android wallpaper colors)

Each family declares `never`, `opt-in` or `default`. Scriptorium is `never` (the palette is the identity); Health is `opt-in`. Dark theme, font scale, contrast level and reduced motion from the OS are always honored.

## Versioning

The engine is versioned in `engine/VERSION` (semver). Client repos record the exact commit they copied in `engine.lock.json` and update with `node tools/update-engine.mjs <ref>`.

## License

Engine and tooling: MIT (`LICENSE`). Brander names, icons and signatures: see `NOTICE.md`.
