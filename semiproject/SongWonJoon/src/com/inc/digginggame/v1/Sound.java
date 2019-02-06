package com.inc.digginggame.v1;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
	Clip clip1;
	Clip clip2;
	
	void playSound() {
   clip1.setFramePosition(0); // rewind to the beginning
   clip1.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	void endSound() {
		clip1.close();
	}
	
	void playEffectSound() {
		clip2.setFramePosition(0);
		clip2.loop(0);
	}
	
	void endEffectSound() {
		clip2.close();
	}
	
	private void pageSound(String file) {
		try {
			File soundFile = new File(file);
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
      clip1 = AudioSystem.getClip();
	    clip1.open(audioInputStream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void mainMenuSound() {
		pageSound("src/soundfile/MainMenu.wav");
	}
	
	void gamePlaySound() {
		pageSound("src/soundfile/GamePlay.wav");
		FloatControl gainControl = (FloatControl) clip1.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(-5.0f);
	}
	
	void infoPageSound() {
		pageSound("src/soundfile/InfoMenu.wav");
	}
	
	private void effectSound(String file) {
		try {
			File soundFile = new File(file);
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
      clip2 = AudioSystem.getClip();
	    clip2.open(audioInputStream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void getTimeItemEffectSound() {
		effectSound("src/soundFile/GetTimeItem2.wav");
	}
	
	void getLifeItemEffectSound() {
		effectSound("src/soundFile/GetLifeItem2.wav");
	}
	
	void loseLifeEffectSound() {
		effectSound("src/soundFile/LoseLife2.wav");
	}
	
	void gameOverEffectSound() {
		effectSound("src/soundFile/GameOver2.wav");
		FloatControl gainControl = (FloatControl) clip2.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(-10.0f);
	}
	
	void menuSelectEffectSound() {
		effectSound("src/soundFile/SelectMenu.wav");
		FloatControl gainControl = (FloatControl) clip2.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(-15.0f);
	}
	
	void exitEffectSound() {
		effectSound("src/soundFile/Windows XP Shutdown.wav");
	}
	
}
