// Brander :: herald (Scriptorium family). Built with Armature engine 1.2.0. Generated, do not edit.
package digital.brander.theme.herald

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Roles that Material 3 has no slot for. Read with ArmatureTheme.extra */
@Immutable
data class ArmatureExtraColors(
    val background: Color,
    val foreground: Color,
    val card: Color,
    val cardForeground: Color,
    val popover: Color,
    val popoverForeground: Color,
    val primary: Color,
    val primaryForeground: Color,
    val secondary: Color,
    val secondaryForeground: Color,
    val muted: Color,
    val mutedForeground: Color,
    val accent: Color,
    val accentForeground: Color,
    val destructive: Color,
    val destructiveForeground: Color,
    val border: Color,
    val input: Color,
    val ring: Color,
    val highlight: Color,
)

val ArmatureLightExtra = ArmatureExtraColors(
    background = Color(0xFFF4EDDF),
    foreground = Color(0xFF1C1712),
    card = Color(0xFFFBF7EE),
    cardForeground = Color(0xFF1C1712),
    popover = Color(0xFFFBF7EE),
    popoverForeground = Color(0xFF1C1712),
    primary = Color(0xFF1E467F),
    primaryForeground = Color(0xFFFBF7EE),
    secondary = Color(0xFFE9DEC8),
    secondaryForeground = Color(0xFF2A231B),
    muted = Color(0xFFE9DEC8),
    mutedForeground = Color(0xFF574C3F),
    accent = Color(0xFFF5E9C4),
    accentForeground = Color(0xFF1C1712),
    destructive = Color(0xFF8E2318),
    destructiveForeground = Color(0xFFFBF7EE),
    border = Color(0xFFD6C7A8),
    input = Color(0xFF6E6252),
    ring = Color(0xFF1E467F),
    highlight = Color(0xFF8F6F1C),
)
val ArmatureDarkExtra = ArmatureExtraColors(
    background = Color(0xFF1A1612),
    foreground = Color(0xFFF4EDDF),
    card = Color(0xFF241F19),
    cardForeground = Color(0xFFF4EDDF),
    popover = Color(0xFF322B23),
    popoverForeground = Color(0xFFF4EDDF),
    primary = Color(0xFF9DBCEA),
    primaryForeground = Color(0xFF12100C),
    secondary = Color(0xFF322B23),
    secondaryForeground = Color(0xFFF4EDDF),
    muted = Color(0xFF241F19),
    mutedForeground = Color(0xFFB9A784),
    accent = Color(0xFF3A3020),
    accentForeground = Color(0xFFE3C46E),
    destructive = Color(0xFFEC9A88),
    destructiveForeground = Color(0xFF12100C),
    border = Color(0xFF4A4035),
    input = Color(0xFFB9A784),
    ring = Color(0xFF9DBCEA),
    highlight = Color(0xFFE3C46E),
)

val ArmatureLightScheme = lightColorScheme(
    background = Color(0xFFF4EDDF),
    onBackground = Color(0xFF1C1712),
    surfaceContainerLow = Color(0xFFFBF7EE),
    onSurface = Color(0xFF1C1712),
    surfaceContainerHigh = Color(0xFFFBF7EE),
    primary = Color(0xFF1E467F),
    onPrimary = Color(0xFFFBF7EE),
    secondaryContainer = Color(0xFFE9DEC8),
    onSecondaryContainer = Color(0xFF2A231B),
    surfaceVariant = Color(0xFFE9DEC8),
    onSurfaceVariant = Color(0xFF574C3F),
    tertiaryContainer = Color(0xFFF5E9C4),
    onTertiaryContainer = Color(0xFF1C1712),
    error = Color(0xFF8E2318),
    onError = Color(0xFFFBF7EE),
    outlineVariant = Color(0xFFD6C7A8),
    outline = Color(0xFF6E6252),
    secondary = Color(0xFF1E467F),
    tertiary = Color(0xFF8F6F1C),
    surface = Color(0xFFF4EDDF),
    surfaceBright = Color(0xFFFBF7EE),
    surfaceDim = Color(0xFFE9DEC8),
    surfaceContainerLowest = Color(0xFFFBF7EE),
    surfaceContainer = Color(0xFFFBF7EE),
    surfaceContainerHighest = Color(0xFFE9DEC8),
    primaryContainer = Color(0xFFF5E9C4),
    onPrimaryContainer = Color(0xFF1C1712),
    onSecondary = Color(0xFFFBF7EE),
    onTertiary = Color(0xFFF4EDDF),
    inverseSurface = Color(0xFF1C1712),
    inverseOnSurface = Color(0xFFF4EDDF),
)
val ArmatureDarkScheme = darkColorScheme(
    background = Color(0xFF1A1612),
    onBackground = Color(0xFFF4EDDF),
    surfaceContainerLow = Color(0xFF241F19),
    onSurface = Color(0xFFF4EDDF),
    surfaceContainerHigh = Color(0xFF322B23),
    primary = Color(0xFF9DBCEA),
    onPrimary = Color(0xFF12100C),
    secondaryContainer = Color(0xFF322B23),
    onSecondaryContainer = Color(0xFFF4EDDF),
    surfaceVariant = Color(0xFF241F19),
    onSurfaceVariant = Color(0xFFB9A784),
    tertiaryContainer = Color(0xFF3A3020),
    onTertiaryContainer = Color(0xFFE3C46E),
    error = Color(0xFFEC9A88),
    onError = Color(0xFF12100C),
    outlineVariant = Color(0xFF4A4035),
    outline = Color(0xFFB9A784),
    secondary = Color(0xFF9DBCEA),
    tertiary = Color(0xFFE3C46E),
    surface = Color(0xFF1A1612),
    surfaceBright = Color(0xFF241F19),
    surfaceDim = Color(0xFF241F19),
    surfaceContainerLowest = Color(0xFF241F19),
    surfaceContainer = Color(0xFF241F19),
    surfaceContainerHighest = Color(0xFF241F19),
    primaryContainer = Color(0xFF3A3020),
    onPrimaryContainer = Color(0xFFE3C46E),
    onSecondary = Color(0xFF12100C),
    onTertiary = Color(0xFF1A1612),
    inverseSurface = Color(0xFFF4EDDF),
    inverseOnSurface = Color(0xFF1A1612),
)

object ArmatureDimens {
    val space0 = 0.dp
    val space1 = 4.dp
    val space2 = 8.dp
    val space3 = 12.dp
    val space4 = 16.dp
    val space5 = 20.dp
    val space6 = 24.dp
    val space8 = 32.dp
    val space10 = 40.dp
    val space12 = 48.dp
    val space16 = 64.dp
    val space20 = 80.dp
    val touchMin = 48.dp
    val touch = 56.dp
    val focusWidth = 3.dp
    val radiusComponent = 2.dp
    val radiusContainer = 4.dp
}

/** Sizes in sp so they follow the user's system font scale. Font families are wired in the app module (res/font). */
object ArmatureTypeScale {
    val caption = 14.sp
    val label = 16.sp
    val body = 18.sp
    val bodyLg = 20.sp
    val titleSm = 22.sp
    val title = 28.sp
    val headline = 35.sp
    val display = 44.sp
    val displayLg = 55.sp
}

/**
 * Material 3 typography from the type scale. Pass the app's bundled font families.
 * Display and headline styles use the display face only from the title size up.
 */
fun armatureTypography(
    display: FontFamily,
    ui: FontFamily,
): Typography {
    val s = ArmatureTypeScale
    fun style(f: FontFamily, size: androidx.compose.ui.unit.TextUnit, lh: Float, w: FontWeight = FontWeight.Normal) =
        TextStyle(fontFamily = f, fontWeight = w, fontSize = size, lineHeight = size * lh)
    return Typography(
        displayLarge = style(display, s.displayLg, 1.2f, FontWeight.SemiBold),
        displayMedium = style(display, s.display, 1.2f, FontWeight.SemiBold),
        displaySmall = style(display, s.headline, 1.2f, FontWeight.Medium),
        headlineLarge = style(display, s.headline, 1.2f, FontWeight.Medium),
        headlineMedium = style(display, s.title, 1.2f, FontWeight.Medium),
        headlineSmall = style(ui, s.titleSm, 1.35f, FontWeight.Bold),
        titleLarge = style(ui, s.titleSm, 1.35f, FontWeight.Bold),
        titleMedium = style(ui, s.bodyLg, 1.35f, FontWeight.SemiBold),
        titleSmall = style(ui, s.label, 1.35f, FontWeight.SemiBold),
        bodyLarge = style(ui, s.bodyLg, 1.55f),
        bodyMedium = style(ui, s.body, 1.55f),
        bodySmall = style(ui, s.label, 1.55f),
        labelLarge = style(ui, s.label, 1.35f, FontWeight.SemiBold),
        labelMedium = style(ui, s.caption, 1.35f, FontWeight.SemiBold),
        labelSmall = style(ui, s.caption, 1.35f),
    )
}

/** Long-form reading style (notes, articles, transcripts). */
fun armatureReadingStyle(reading: FontFamily) =
    TextStyle(fontFamily = reading, fontSize = ArmatureTypeScale.bodyLg, lineHeight = ArmatureTypeScale.bodyLg * 1.7f)

val ArmatureShapes = Shapes(
    extraSmall = RoundedCornerShape(ArmatureDimens.radiusComponent),
    small = RoundedCornerShape(ArmatureDimens.radiusComponent),
    medium = RoundedCornerShape(ArmatureDimens.radiusContainer),
    large = RoundedCornerShape(ArmatureDimens.radiusContainer),
)

val LocalArmatureExtra = staticCompositionLocalOf { ArmatureLightExtra }

object ArmatureTheme {
    /** Family policy: "never". The palette is the identity. Android wallpaper colors would erase the vellum and tincture system. Dark theme, font scale, contrast level and reduced motion from the OS are still always honored. */
    const val DYNAMIC_COLOR_POLICY = "never"
    val extra: ArmatureExtraColors @Composable get() = LocalArmatureExtra.current
}

@Composable
fun ArmatureTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    /** User setting. Ignored when the family policy is "never". */
    useWallpaperColors: Boolean = false,
    typography: Typography = Typography(),
    content: @Composable () -> Unit,
) {
    val allowDynamic = false
    val scheme = when {
        allowDynamic && darkTheme -> dynamicDarkColorScheme(LocalContext.current)
        allowDynamic -> dynamicLightColorScheme(LocalContext.current)
        darkTheme -> ArmatureDarkScheme
        else -> ArmatureLightScheme
    }
    CompositionLocalProvider(LocalArmatureExtra provides if (darkTheme) ArmatureDarkExtra else ArmatureLightExtra) {
        MaterialTheme(colorScheme = scheme, typography = typography, shapes = ArmatureShapes, content = content)
    }
}
