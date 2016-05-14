package it.polito.tdp.spellchecker.model;

import java.util.*;

public class Dictionary {

	protected List<String> dizionario;
	protected List<RichWord> parole;

	public Dictionary() {
		dizionario = new LinkedList<String>();
	}

	public void loadDictionary() {
	};

	public List<RichWord> spellCheckText(List<String> inputTextList) {
		parole = new LinkedList<RichWord>();
		for (String s : inputTextList) {
			RichWord rw = null;
			boolean trovata = false;
			for (String d : dizionario) {
				if (s.compareTo(d) == 0)
					trovata = true;
			}
			if (trovata) {
				rw = new RichWord(s, true);
				parole.add(rw);
			} else {
				rw = new RichWord(s, false);
				parole.add(rw);
			}
		}
		return parole;
	}
}
