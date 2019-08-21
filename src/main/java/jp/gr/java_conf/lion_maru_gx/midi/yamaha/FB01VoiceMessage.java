package jp.gr.java_conf.lion_maru_gx.midi.yamaha;

import lombok.Getter;
import lombok.Setter;

public class FB01VoiceMessage {

	/*
	 * 1 Voice Name
	 */
	@Getter @Setter
	private String voiceName;
	/*
	 * 2 User's Code
	 */
	/**
	 * 3
	 */
	/**
	 * 4
	 */
	/**
	 * 5
	 */
	/**
	 * 6
	 */
	/**
	 * 7
	 */
	/**
	 * 8
	 */
	/**
	 * 9
	 */
	/**
	 * 10
	 */
	/**
	 * 11
	 */
	/**
	 * 12
	 */
	/**
	 * 13
	 */
	/**
	 * 14
	 */
	/**
	 * 15
	 */
	/**
	 * 16
	 */
	@Getter @Setter
	private short ar1;

	@Override
	public FB01VoiceMessage clone() throws CloneNotSupportedException {
		FB01VoiceMessage temp =  (FB01VoiceMessage)super.clone();;
		return temp;

	}
}
