package chapter9_examples;

class SimpleCircle {
	// The radius
	double radius;
	
	// Construct a circle with radius 1 
	SimpleCircle() {
		radius = 1;
	}

	// Construct a circle with a specified radius 
	SimpleCircle(double newRadius) {
		radius = newRadius;
	}

	// Return the area 
	double getArea() {
		return radius * radius * Math.PI;
	}
}
