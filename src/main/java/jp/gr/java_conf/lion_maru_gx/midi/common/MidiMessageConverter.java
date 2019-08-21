package jp.gr.java_conf.lion_maru_gx.midi.common;

public interface MidiMessageConverter<X,Y> {
    public Y convertToDataObject (X midiMessage);
    public X convertToMidiMessage (Y dataObject);
}
