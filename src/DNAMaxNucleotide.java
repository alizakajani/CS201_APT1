
public class DNAMaxNucleotide {
	public String max(String[] strands, String nuc) {

		int maxNuc = 0;
		String maxStrand = "";
		char nucleo = nuc.charAt(0);

		for (String strand : strands) {
			int nCount = 0;
			for (int k = 0; k < strand.length(); k += 1) {
				if (strand.charAt(k) == nucleo) {
					nCount += 1;
				}
			}
			if (nCount > maxNuc) {
				maxNuc = nCount;
				maxStrand = strand;
			}
			else if (nCount == maxNuc && maxStrand.length() < strand.length() && ! (nCount == 0)) {
				maxStrand = strand;
			}
		}
		return maxStrand;
	}
}
