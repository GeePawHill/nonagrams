package org.geepawhill.nonagrams

import javafx.geometry.Orientation
import tornadofx.*

class Main : App(MainView::class)

class MainView : View() {
	override val root = splitpane {
		splitpane(Orientation.VERTICAL) {
			stackpane {
				text("This should be top left")
			}
			stackpane {
				text("This should be bottom left")
			}
		}
		stackpane {
			text("This should be right")
		}
	}
}
	
