package com.tom.frogger.engine;

import java.util.concurrent.ThreadLocalRandom;

public class Runner {

	public static void main(String[] args) {

		// road params
		int roadWidth = 50;
		// can be variable so we can wrap the road.
		int roadHeight = 6;
		
		// frog params
		int frogPosX = 0;
		int frogPosY = 0;
		int frogWidth = 0;
		
		// car params
		int carPosX = 0;
		int carPosY = 0;
		int carWidth = 0;
		
		print(drawRoad(roadHeight, roadWidth));
	}

	public static String drawRoad(final int roadHeight, final int roadWidth) {
		final StringBuilder roadBuilder = new StringBuilder();
		final String[][] roadArray = new String[roadWidth][roadHeight];
		roadBuilder.append("--------------------------------------------------\n");
		
		for (int i = 0; i < roadHeight; i++) {
			final int randomCarOnRoadHeight = ThreadLocalRandom.current().nextInt(roadHeight, roadWidth + 1);
			//roadBuilder.append("*"/* + randomCarOnRoadHeight*/);
			
			for (int j = 0; j < roadWidth; j++) {
				final int randomCarOnRoadWidth = ThreadLocalRandom.current().nextInt(roadHeight, roadWidth + 1);
				
				
				if (randomCarOnRoadWidth == j || randomCarOnRoadHeight == i) {
					//roadBuilder.append("*"/* + randomCarOnRoadWidth*/);
					roadBuilder.append(randomCarOnRoadWidth + ":" + randomCarOnRoadHeight + " ");
				}
				
				if (j == roadWidth-1) { 
					roadBuilder.append("\n");
					//roadBuilder.append("i:j " + i+":"+j);
				}
				
			}
		}
		
		roadBuilder.append("--------------------------------------------------\n");
		
		return roadBuilder.toString();
	}
	
	public static void print(final Object input) {
		System.out.print(input);
	}
}
