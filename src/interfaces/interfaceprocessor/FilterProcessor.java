package interfaces.interfaceprocessor;
class FilterAdapter implements Processor{
	Filter filter;
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	public String name() {
		return filter.name();
	}
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
	}
}
public class FilterProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
	}

}
