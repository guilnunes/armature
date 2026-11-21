# Working in this repo

Armature is a design token engine (`engine/`) plus Brander's own owner layer (`brander/`). Read `README.md` first.

## Rules

- Never hand edit anything under `*/dist/` or `*/docs/contrast-report.md`. Change tokens, then run `node engine/build.mjs brander` and commit the source and the generated files together. CI fails if they are out of sync.
- The build must pass with 0 contrast failures. Never lower an accessibility threshold to make it pass; change the color instead.
- Engine changes (`engine/`) must stay owner agnostic: no Brander names, colors or signatures in the engine. Bump `engine/VERSION` (semver) when the engine changes.
- Brander signatures live only in `brander/owner.json`. Never copy them into client repos.
- Write in English. No em dash characters in docs.
- Do the work end to end (commits, pushes, merges once CI is green) rather than leaving manual steps for the owner.

## Status page

At the end of every working session, update the project's Notion page in the Projects database, "Armature: Brander design foundation" (https://www.notion.so/41ffa617db4f8161950eec4be7157791): add a dated line to the Status log, and set Status, Last surface, Last worked, Next step and Blocker.
