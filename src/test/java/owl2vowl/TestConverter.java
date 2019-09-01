package owl2vowl;

import owl2vowl.converter.InputStreamConverter;
import owl2vowl.model.data.VowlData;
import java.io.InputStream;

public class TestConverter extends InputStreamConverter {

	public TestConverter(InputStream ontology) {
		super(ontology);
	}

	public VowlData getConvertedData() {
		if (!this.initialized) {
			this.convert();
		}
		return this.vowlData;
	}
}
