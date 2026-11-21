// Brander :: health (Health family). Built with Armature engine 1.1.0. Generated, do not edit.
import SwiftUI

extension Color {
    init(light: (Double, Double, Double), dark: (Double, Double, Double)) {
        self.init(uiColor: UIColor { $0.userInterfaceStyle == .dark
            ? UIColor(red: dark.0, green: dark.1, blue: dark.2, alpha: 1)
            : UIColor(red: light.0, green: light.1, blue: light.2, alpha: 1) })
    }
}

public enum Armature {
    public static let background = Color(light: (0.9686, 0.9804, 0.9843), dark: (0.0431, 0.0667, 0.0784))
    public static let foreground = Color(light: (0.0706, 0.1020, 0.1176), dark: (0.9333, 0.9529, 0.9608))
    public static let card = Color(light: (1.0000, 1.0000, 1.0000), dark: (0.0706, 0.1020, 0.1176))
    public static let cardForeground = Color(light: (0.0706, 0.1020, 0.1176), dark: (0.9333, 0.9529, 0.9608))
    public static let popover = Color(light: (1.0000, 1.0000, 1.0000), dark: (0.1216, 0.1647, 0.1882))
    public static let popoverForeground = Color(light: (0.0706, 0.1020, 0.1176), dark: (0.9333, 0.9529, 0.9608))
    public static let primary = Color(light: (0.0471, 0.3412, 0.3255), dark: (0.4980, 0.8275, 0.8000))
    public static let primaryForeground = Color(light: (1.0000, 1.0000, 1.0000), dark: (0.0431, 0.0667, 0.0784))
    public static let secondary = Color(light: (0.9333, 0.9529, 0.9608), dark: (0.1216, 0.1647, 0.1882))
    public static let secondaryForeground = Color(light: (0.1216, 0.1647, 0.1882), dark: (0.9333, 0.9529, 0.9608))
    public static let muted = Color(light: (0.9333, 0.9529, 0.9608), dark: (0.0706, 0.1020, 0.1176))
    public static let mutedForeground = Color(light: (0.2431, 0.2980, 0.3255), dark: (0.8667, 0.9020, 0.9176))
    public static let accent = Color(light: (0.8275, 0.9412, 0.9333), dark: (0.1216, 0.1647, 0.1882))
    public static let accentForeground = Color(light: (0.0706, 0.1020, 0.1176), dark: (0.4980, 0.8275, 0.8000))
    public static let destructive = Color(light: (0.6314, 0.1882, 0.1176), dark: (0.9569, 0.6392, 0.5804))
    public static let destructiveForeground = Color(light: (1.0000, 1.0000, 1.0000), dark: (0.0431, 0.0667, 0.0784))
    public static let border = Color(light: (0.8667, 0.9020, 0.9176), dark: (0.1216, 0.1647, 0.1882))
    public static let input = Color(light: (0.3608, 0.4314, 0.4667), dark: (0.3608, 0.4314, 0.4667))
    public static let ring = Color(light: (0.0471, 0.3412, 0.3255), dark: (0.4980, 0.8275, 0.8000))
    public static let highlight = Color(light: (0.0471, 0.3412, 0.3255), dark: (0.4980, 0.8275, 0.8000))

    public enum Space {
        public static let s0: CGFloat = 0
        public static let s1: CGFloat = 4
        public static let s2: CGFloat = 8
        public static let s3: CGFloat = 12
        public static let s4: CGFloat = 16
        public static let s5: CGFloat = 20
        public static let s6: CGFloat = 24
        public static let s8: CGFloat = 32
        public static let s10: CGFloat = 40
        public static let s12: CGFloat = 48
        public static let s16: CGFloat = 64
        public static let s20: CGFloat = 80
    }
    public static let touchMin: CGFloat = 48
    public static let radius: CGFloat = 12
    public static let radiusContainer: CGFloat = 20
    /// Base point sizes. Use with .font(.custom(name, size:, relativeTo:)) so Dynamic Type scales them.
    public enum TypeScale {
        public static let caption: CGFloat = 16
        public static let label: CGFloat = 17
        public static let body: CGFloat = 18
        public static let bodyLg: CGFloat = 20
        public static let titleSm: CGFloat = 22
        public static let title: CGFloat = 28
        public static let headline: CGFloat = 35
        public static let display: CGFloat = 44
        public static let displayLg: CGFloat = 55
    }
}
