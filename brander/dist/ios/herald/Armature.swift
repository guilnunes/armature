// Brander :: herald (Scriptorium family). Built with Armature engine 1.1.0. Generated, do not edit.
import SwiftUI

extension Color {
    init(light: (Double, Double, Double), dark: (Double, Double, Double)) {
        self.init(uiColor: UIColor { $0.userInterfaceStyle == .dark
            ? UIColor(red: dark.0, green: dark.1, blue: dark.2, alpha: 1)
            : UIColor(red: light.0, green: light.1, blue: light.2, alpha: 1) })
    }
}

public enum Armature {
    public static let background = Color(light: (0.9569, 0.9294, 0.8745), dark: (0.1020, 0.0863, 0.0706))
    public static let foreground = Color(light: (0.1098, 0.0902, 0.0706), dark: (0.9569, 0.9294, 0.8745))
    public static let card = Color(light: (0.9843, 0.9686, 0.9333), dark: (0.1412, 0.1216, 0.0980))
    public static let cardForeground = Color(light: (0.1098, 0.0902, 0.0706), dark: (0.9569, 0.9294, 0.8745))
    public static let popover = Color(light: (0.9843, 0.9686, 0.9333), dark: (0.1961, 0.1686, 0.1373))
    public static let popoverForeground = Color(light: (0.1098, 0.0902, 0.0706), dark: (0.9569, 0.9294, 0.8745))
    public static let primary = Color(light: (0.1176, 0.2745, 0.4980), dark: (0.6157, 0.7373, 0.9176))
    public static let primaryForeground = Color(light: (0.9843, 0.9686, 0.9333), dark: (0.0706, 0.0627, 0.0471))
    public static let secondary = Color(light: (0.9137, 0.8706, 0.7843), dark: (0.1961, 0.1686, 0.1373))
    public static let secondaryForeground = Color(light: (0.1647, 0.1373, 0.1059), dark: (0.9569, 0.9294, 0.8745))
    public static let muted = Color(light: (0.9137, 0.8706, 0.7843), dark: (0.1412, 0.1216, 0.0980))
    public static let mutedForeground = Color(light: (0.3412, 0.2980, 0.2471), dark: (0.7255, 0.6549, 0.5176))
    public static let accent = Color(light: (0.9608, 0.9137, 0.7686), dark: (0.2275, 0.1882, 0.1255))
    public static let accentForeground = Color(light: (0.1098, 0.0902, 0.0706), dark: (0.8902, 0.7686, 0.4314))
    public static let destructive = Color(light: (0.5569, 0.1373, 0.0941), dark: (0.9255, 0.6039, 0.5333))
    public static let destructiveForeground = Color(light: (0.9843, 0.9686, 0.9333), dark: (0.0706, 0.0627, 0.0471))
    public static let border = Color(light: (0.8392, 0.7804, 0.6588), dark: (0.2902, 0.2510, 0.2078))
    public static let input = Color(light: (0.4314, 0.3843, 0.3216), dark: (0.7255, 0.6549, 0.5176))
    public static let ring = Color(light: (0.1176, 0.2745, 0.4980), dark: (0.6157, 0.7373, 0.9176))
    public static let highlight = Color(light: (0.5608, 0.4353, 0.1098), dark: (0.8902, 0.7686, 0.4314))

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
    public static let radius: CGFloat = 2
    public static let radiusContainer: CGFloat = 4
    /// Base point sizes. Use with .font(.custom(name, size:, relativeTo:)) so Dynamic Type scales them.
    public enum TypeScale {
        public static let caption: CGFloat = 14
        public static let label: CGFloat = 16
        public static let body: CGFloat = 18
        public static let bodyLg: CGFloat = 20
        public static let titleSm: CGFloat = 22
        public static let title: CGFloat = 28
        public static let headline: CGFloat = 35
        public static let display: CGFloat = 44
        public static let displayLg: CGFloat = 55
    }
}
