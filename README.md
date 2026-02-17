
# CS501 HW3 - Q4 Responsive Layout Challenge: Phone vs Tablet

This app demonstrates a single responsive screen in Jetpack Compose that adapts its layout based on device width, as required for Q4 Responsive Layout Challenge.

## How to run
- Open the project in Android Studio
- Run the app on an emulator or device (phone and tablet/landscape for both modes)

## Assignment Requirements & Implementation

### Responsive Layout
- **Narrow screens (phone):** Uses a single Column layout with a header, selected item display, and a vertical list of options (LazyColumn). A reset button is provided at the bottom.
- **Wide screens (tablet/landscape):** Uses a Row with two panes:
	- **Left pane:** Custom navigation/options list (Column with LazyColumn and ListItem for each option)
	- **Right pane:** Detail content (Box + Column, showing selected item and a reset button inside a Card)
- **Breakpoint:** Uses `BoxWithConstraints` to switch layouts at 600.dp width.

### Material 3 Components Used (6+):
- Card
- Button
- HorizontalDivider
- ListItem
- Surface
- Text

### Modifier Usage
- `weight()` is used to allocate space between left and right panes in wide mode.
- `fillMaxHeight()` and `fillMaxWidth()` are used for proper sizing.
- `padding`, `clickable`, and other modifiers are demonstrated.
- `LazyColumn` is used for the options list (fulfilling the vertical scroll requirement).

### Other Notes
- The left pane in wide mode is a custom navigation/options list using ListItem (as allowed by the assignment).
- The UI is composed using strong Row/Column/Box composition in both modes.

## Screenshots
- Responsive screen (phone):<br>
<img src="screenshots/responsive-phone.png" width="300">

- Responsive screen (tablet/landscape):<br>
<img src="screenshots/responsive-tab.png" width="300">

## AI Disclosure
AI was used to help write this README, clarify assignment requirements, and check for completeness. No code was directly copied from AI output; all code was written and adapted by me.