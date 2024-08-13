module ConectandoLocalidades {
	requires junit;
	requires java.desktop;
	requires java.sql;
	requires JMapViewer;
	requires gson;
	requires jdk.incubator.vector;

	opens negocio to gson;
}