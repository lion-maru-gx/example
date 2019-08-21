package jp.gr.java_conf.lion_maru_gx.midi.yamaha;

public class FB01VoiceBulkMessage {
	FB01VoiceMessage[] voiceMessages= new FB01VoiceMessage[48];

	public FB01VoiceMessage getVoiceMessage(int i) {
		return voiceMessages[i];
	}
}
