package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	boolean run = true;
	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		while (run == true) {
		String animal = JOptionPane.showInputDialog("What animal do you want: \n"
				+ "Cow, Duck or Dog");
		if(animal.equalsIgnoreCase("cow")) {
			playMoo();
		}else if(animal.equalsIgnoreCase("duck")) {
			playQuack();
		}else if(animal.equalsIgnoreCase("dog")) {
			playWoof();
		}
		}
		
		/* 2. Make it so that the user can keep entering new animals. */
	}
	

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
