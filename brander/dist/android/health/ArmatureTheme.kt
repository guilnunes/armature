// Brander :: health (Health family). Built with Armature engine 1.1.0. Generated, do not edit.
package digital.brander.theme.health

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
    background = Color(0xFFF7FAFB),
    foreground = Color(0xFF121A1E),
    card = Color(0xFFFFFFFF),
    cardForeground = Color(0xFF121A1E),
    popover = Color(0xFFFFFFFF),
    popoverForeground = Color(0xFF121A1E),
    primary = Color(0xFF0C5753),
    primaryForeground = Color(0xFFFFFFFF),
    secondary = Color(0xFFEEF3F5),
    secondaryForeground = Color(0xFF1F2A30),
    muted = Color(0xFFEEF3F5),
    mutedForeground = Color(0xFF3E4C53),
    accent = Color(0xFFD3F0EE),
    accentForeground = Color(0xFF121A1E),
    destructive = Color(0xFFA1301E),
    destructiveForeground = Color(0xFFFFFFFF),
    border = Color(0xFFDDE6EA),
    input = Color(0xFF5C6E77),
    ring = Color(0xFF0C5753),
    highlight = Color(0xFF0C5753),
)
val ArmatureDarkExtra = ArmatureExtraColors(
    background = Color(0xFF0B1114),
    foreground = Color(0xFFEEF3F5),
    card = Color(0xFF121A1E),
    cardForeground = Color(0xFFEEF3F5),
    popover = Color(0xFF1F2A30),
    popoverForeground = Color(0xFFEEF3F5),
    primary = Color(0xFF7FD3CC),
    primaryForeground = Color(0xFF0B1114),
    secondary = Color(0xFF1F2A30),
    secondaryForeground = Color(0xFFEEF3F5),
    muted = Color(0xFF121A1E),
    mutedForeground = Color(0xFFDDE6EA),
    accent = Color(0xFF1F2A30),
    accentForeground = Color(0xFF7FD3CC),
    destructive = Color(0xFFF4A394),
    destructiveForeground = Color(0xFF0B1114),
    border = Color(0xFF1F2A30),
    input = Color(0xFF5C6E77),
    ring = Color(0xFF7FD3CC),
    highlight = Color(0xFF7FD3CC),
)

val ArmatureLightScheme = lightColorScheme(
    background = Color(0xFFF7FAFB),
    onBackground = Color(0xFF121A1E),
    surfaceContainerLow = Color(0xFFFFFFFF),
    onSurface = Color(0xFF121A1E),
    surfaceContainerHigh = Color(0xFFFFFFFF),
    primary = Color(0xFF0C5753),
    onPrimary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFEEF3F5),
    onSecondaryContainer = Color(0xFF1F2A30),
    surfaceVariant = Color(0xFFEEF3F5),
    onSurfaceVariant = Color(0xFF3E4C53),
    tertiaryContainer = Color(0xFFD3F0EE),
    onTertiaryContainer = Color(0xFF121A1E),
    error = Color(0xFFA1301E),
    onError = Color(0xFFFFFFFF),
    outlineVariant = Color(0xFFDDE6EA),
    outline = Color(0xFF5C6E77),
    secondary = Color(0xFF0C5753),
    tertiary = Color(0xFF0C5753),
    surface = Color(0xFFF7FAFB),
    surfaceBright = Color(0xFFFFFFFF),
    surfaceDim = Color(0xFFEEF3F5),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainer = Color(0xFFFFFFFF),
    surfaceContainerHighest = Color(0xFFEEF3F5),
    primaryContainer = Color(0xFFD3F0EE),
    onPrimaryContainer = Color(0xFF121A1E),
    onSecondary = Color(0xFFFFFFFF),
    onTertiary = Color(0xFFF7FAFB),
    inverseSurface = Color(0xFF121A1E),
    inverseOnSurface = Color(0xFFF7FAFB),
)
val ArmatureDarkScheme = darkColorScheme(
    background = Color(0xFF0B1114),
    onBackground = Color(0xFFEEF3F5),
    surfaceContainerLow = Color(0xFF121A1E),
    onSurface = Color(0xFFEEF3F5),
    surfaceContainerHigh = Color(0xFF1F2A30),
    primary = Color(0xFF7FD3CC),
    onPrimary = Color(0xFF0B1114),
    secondaryContainer = Color(0xFF1F2A30),
    onSecondaryContainer = Color(0xFFEEF3F5),
    surfaceVariant = Color(0xFF121A1E),
    onSurfaceVariant = Color(0xFFDDE6EA),
    tertiaryContainer = Color(0xFF1F2A30),
    onTertiaryContainer = Color(0xFF7FD3CC),
    error = Color(0xFFF4A394),
    onError = Color(0xFF0B1114),
    outlineVariant = Color(0xFF1F2A30),
    outline = Color(0xFF5C6E77),
    secondary = Color(0xFF7FD3CC),
    tertiary = Color(0xFF7FD3CC),
    surface = Color(0xFF0B1114),
    surfaceBright = Color(0xFF121A1E),
    surfaceDim = Color(0xFF121A1E),
    surfaceContainerLowest = Color(0xFF121A1E),
    surfaceContainer = Color(0xFF121A1E),
    surfaceContainerHighest = Color(0xFF121A1E),
    primaryContainer = Color(0xFF1F2A30),
    onPrimaryContainer = Color(0xFF7FD3CC),
    onSecondary = Color(0xFF0B1114),
    onTertiary = Color(0xFF0B1114),
    inverseSurface = Color(0xFFEEF3F5),
    inverseOnSurface = Color(0xFF0B1114),
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
    val radiusComponent = 12.dp
    val radiusContainer = 20.dp
}

/** Sizes in sp so they follow the user's system font scale. Font families are wired in the app module (res/font). */
object ArmatureTypeScale {
    val caption = 16.sp
    val label = 17.sp
    val body = 18.sp
    val bodyLg = 20.sp
    val titleSm = 22.sp
    val title = 28.sp
    val headline = 35.sp
    val display = 44.sp
    val displayLg = 55.sp
}

val ArmatureShapes = Shapes(
    extraSmall = RoundedCornerShape(ArmatureDimens.radiusComponent),
    small = RoundedCornerShape(ArmatureDimens.radiusComponent),
    medium = RoundedCornerShape(ArmatureDimens.radiusContainer),
    large = RoundedCornerShape(ArmatureDimens.radiusContainer),
)

val LocalArmatureExtra = staticCompositionLocalOf { ArmatureLightExtra }

object ArmatureTheme {
    /** Family policy: "opt-in". Clinical apps benefit from feeling native; users may switch to wallpaper colors in settings, but status colors (vitals, alerts) are never replaced. */
    const val DYNAMIC_COLOR_POLICY = "opt-in"
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
    val allowDynamic = useWallpaperColors && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
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
