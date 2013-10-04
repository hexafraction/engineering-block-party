package com.github.rarkenin.engineering_block_party;

import java.util.ArrayList;

public class EngineeringDrawing {

	public class Cube {
		public long x, y, z;
	}
	public static class Line{
		public Point p1;
		public Point p2;
		public View view;
		public Orientation orientation;
		public long lengthTicks;
	}
	public static class Dimension extends Line{
		public EngineeringDrawing.ExtensionLine ext1;
		public EngineeringDrawing.ExtensionLine ext2;
		public long lengthTicks;
		public EngineeringDrawing.Orientation orientation;
	}

	public static class ObjectLine extends Line{

	}

	public static class ExtensionLine extends Line {
		
	}

	public static class HiddenLine extends Line{

	}

	public static class EngView {

	}

	public class Point {
		View view;
		public long ticksX;
		public long ticksY;
		ArrayList<Line> lines;
	}	

	
	public enum View {
		FACE_FRONT, FACE_TOP, FACE_RIGHT
	}

	public enum Orientation {
		VERTICAL, HORIZONTAL
	}
	
	public static class Face{
		long zindex;
		ArrayList<ObjectLine> objectLines;
		ArrayList<Dimension> dimension;
		ArrayList<Cube> cubes;
	}
}
