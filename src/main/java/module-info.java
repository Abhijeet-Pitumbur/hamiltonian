module hamiltonian {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires com.jfoenix;
	exports hamiltonian;
	opens hamiltonian to javafx.fxml;
}