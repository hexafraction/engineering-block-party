package com.github.rarkenin.engineering_block_party;

public class EngineeringDrawing {

	
	public static class Dimension {
		public EngineeringDrawing.ExtensionLine ext1;
		public EngineeringDrawing.ExtensionLine ext2;
		public long lengthTicks;
		public EngineeringDrawing.Orientation orientation;
	}

	public static class ObjectLine {
		public Face face;
		public Orientation orientation;
		public EngineeringDrawing.Point pt1;
		public EngineeringDrawing.Point pt2;
		public long lengthTicks;
	}

	public static class ExtensionLine {

	}

	public static class HiddenLine {

	}

	public static class EngView {

	}

	public class Point {
		Face face;
		public long ticksX;
		public long ticksY;
	}	

	
	public enum Face {
		FACE_FRONT, FACE_TOP, FACE_RIGHT
	}

	public enum Orientation {
		VERTICAL, HORIZONTAL
	}
}
