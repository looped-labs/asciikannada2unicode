/*
The MIT License (MIT)

Copyright (c) 2015 Looped Labs Pvt. Ltd.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

package com.loopedlabs.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class KnBarahaToUnicode {
	private static final Map<String, String> mapping;
	static {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("C", "ಅ");
		m.put("D", "ಆ");
		m.put("E", "ಇ");
		m.put("F", "ಈ");
		m.put("G", "ಉ");
		m.put("H", "ಊ");
		m.put("IÄ", "ಋ");
		m.put("J", "ಎ");
		m.put("K", "ಏ");
		m.put("L", "ಐ");
		m.put("M", "ಒ");
		m.put("N", "ಓ");
		m.put("O", "ಔ");
		m.put("A", "ಂ");
		m.put("B", "ಃ");
		m.put("Pï", "ಕ್");
		m.put("PÀ", "ಕ");
		m.put("PÁ", "ಕಾ");
		m.put("Q", "ಕಿ");
		m.put("PÉ", "ಕೆ");
		m.put("PË", "ಕೌ");
		m.put("Sï", "ಖ್");
		m.put("R", "ಖ");
		m.put("SÁ", "ಖಾ");
		m.put("T", "ಖಿ");
		m.put("SÉ", "ಖೆ");
		m.put("SË", "ಖೌ");
		m.put("Uï", "ಗ್");
		m.put("UÀ", "ಗ");
		m.put("UÁ", "ಗಾ");
		m.put("V", "ಗಿ");
		m.put("UÉ", "ಗೆ");
		m.put("UË", "ಗೌ");
		m.put("Wï", "ಘ್");
		m.put("WÀ", "ಘ");
		m.put("WÁ", "ಘಾ");
		m.put("X", "ಘಿ");
		m.put("WÉ", "ಘೆ");
		m.put("WË", "ಘೌ");
		m.put("k", "ಞ");
		m.put("Zï", "ಚ್");
		m.put("ZÀ", "ಚ");
		m.put("ZÁ", "ಚಾ");
		m.put("a", "ಚಿ");
		m.put("ZÉ", "ಚೆ");
		m.put("ZË", "ಚೌ");
		m.put("bï", "ಛ್");
		m.put("bÀ", "ಛ");
		m.put("bÁ", "ಛಾ");
		m.put("c", "ಛಿ");
		m.put("bÉ", "ಛೆ");
		m.put("bË", "ಛೌ");
		m.put("eï", "ಜ್");
		m.put("d", "ಜ");
		m.put("eÁ", "ಜಾ");
		m.put("f", "ಜಿ");
		m.put("eÉ", "ಜೆ");
		m.put("eË", "ಜೌ");
		m.put("gÀhiï", "ಝ್");
		m.put("gÀhÄ", "ಝ");
		m.put("gÀhiÁ", "ಝಾ");
		m.put("jhÄ", "ಝಿ");
		m.put("gÉhÄ", "ಝೆ");
		m.put("gÉhÆ", "ಝೊ");
		m.put("gÀhiË", "ಝೌ");
		m.put("Y", "ಙ");
		m.put("mï", "ಟ್");
		m.put("l", "ಟ");
		m.put("mÁ", "ಟಾ");
		m.put("n", "ಟಿ");
		m.put("mÉ", "ಟೆ");
		m.put("mË", "ಟೌ");
		m.put("oï", "ಠ್");
		m.put("oÀ", "ಠ");
		m.put("oÁ", "ಠಾ");
		m.put("p", "ಠಿ");
		m.put("oÉ", "ಠೆ");
		m.put("oË", "ಠೌ");
		m.put("qï", "ಡ್");
		m.put("qÀ", "ಡ");
		m.put("qÁ", "ಡಾ");
		m.put("r", "ಡಿ");
		m.put("qÉ", "ಡೆ");
		m.put("qË", "ಡೌ");
		m.put("qsï", "ಢ್");
		m.put("qsÀ", "ಢ");
		m.put("qsÁ", "ಢಾ");
		m.put("rü", "ಢಿ");
		m.put("qsÉ", "ಢೆ");
		m.put("qsË", "ಢೌ");
		m.put("uï", "ಣ್");
		m.put("t", "ಣ");
		m.put("uÁ", "ಣಾ");
		m.put("tÂ", "ಣಿ");
		m.put("uÉ", "ಣೆ");
		m.put("uË", "ಣೌ");
		m.put("vï", "ತ್");
		m.put("vÀ", "ತ");
		m.put("vÁ", "ತಾ");
		m.put("w", "ತಿ");
		m.put("vÉ", "ತೆ");
		m.put("vË", "ತೌ");
		m.put("xï", "ಥ್");
		m.put("xÀ", "ಥ");
		m.put("xÁ", "ಥಾ");
		m.put("y", "ಥಿ");
		m.put("xÉ", "ಥೆ");
		m.put("xË", "ಥೌ");
		m.put("zï", "ದ್");
		m.put("zÀ", "ದ");
		m.put("zÁ", "ದಾ");
		m.put("¢", "ದಿ");
		m.put("zÉ", "ದೆ");
		m.put("zË", "ದೌ");
		m.put("zsï", "ಧ್");
		m.put("zsÀ", "ಧ");
		m.put("zsÁ", "ಧಾ");
		m.put("¢ü", "ಧಿ");
		m.put("zsÉ", "ಧೆ");
		m.put("zsË", "ಧೌ");
		m.put("£ï", "ನ್");
		m.put("£À", "ನ");
		m.put("£Á", "ನಾ");
		m.put("¤", "ನಿ");
		m.put("£É", "ನೆ");
		m.put("£Ë", "ನೌ");
		m.put("¥ï", "ಪ್");
		m.put("¥À", "ಪ");
		m.put("¥Á", "ಪಾ");
		m.put("¦", "ಪಿ");
		m.put("¥É", "ಪೆ");
		m.put("¥Ë", "ಪೌ");
		m.put("¥sï", "ಫ್");
		m.put("¥sÀ", "ಫ");
		m.put("¥sÁ", "ಫಾ");
		m.put("¦ü", "ಫಿ");
		m.put("¥sÉ", "ಫೆ");
		m.put("¥sË", "ಫೌ");
		m.put("¨ï", "ಬ್");
		m.put("§", "ಬ");
		m.put("¨Á", "ಬಾ");
		m.put("©", "ಬಿ");
		m.put("¨É", "ಬೆ");
		m.put("¨Ë", "ಬೌ");
		m.put("¨sï", "ಭ್");
		m.put("¨sÀ", "ಭ");
		m.put("¨sÁ", "ಭಾ");
		m.put("©ü", "ಭಿ");
		m.put("¨sÉ", "ಭೆ");
		m.put("¨sË", "ಭೌ");
		m.put("ªÀiï", "ಮ್");
		m.put("ªÀÄ", "ಮ");
		m.put("ªÀiÁ", "ಮಾ");
		m.put("«Ä", "ಮಿ");
		m.put("ªÉÄ", "ಮೆ");
		m.put("ªÀiË", "ಮೌ");
		m.put("AiÀiï", "ಯ್");
		m.put("AiÀÄ", "ಯ");
		m.put("0iÀÄ", "ಯ");
		m.put("AiÀiÁ", "ಯಾ");
		m.put("0iÀiÁ", "ಯಾ");
		m.put("¬Ä", "ಯಿ");
		m.put("0iÀÄÄ", "ಯು");
		m.put("AiÉÄ", "ಯೆ");
		m.put("0iÉÆ", "ಯೊ");
		m.put("AiÉÆ", "ಯೊ");
		m.put("AiÀiË", "ಯೌ");
		m.put("gï", "ರ್");
		m.put("gÀ", "ರ");
		m.put("gÁ", "ರಾ");
		m.put("j", "ರಿ");
		m.put("gÉ", "ರೆ");
		m.put("gË", "ರೌ");
		m.put("¯ï", "ಲ್");
		m.put("®", "ಲ");
		m.put("¯Á", "ಲಾ");
		m.put("°", "ಲಿ");
		m.put("¯É", "ಲೆ");
		m.put("¯Ë", "ಲೌ");
		m.put("ªï", "ವ್");
		m.put("ªÀ", "ವ");
		m.put("ªÁ", "ವಾ");
		m.put("«", "ವಿ");
		m.put("ªÀÅ", "ವು");
		m.put("ªÀÇ", "ವೂ");
		m.put("ªÉ", "ವೆ");
		m.put("ªÉÃ", "ವೇ");
		m.put("ªÉÊ", "ವೈ");
		m.put("ªÉÆ", "ಮೊ");
		m.put("ªÉÆÃ", "ಮೋ");
		m.put("ªÉÇ", "ವೊ");
		m.put("ªÉÇÃ", "ವೋ");
		m.put("ªÉ  ", "ವೆ");
		m.put("¥ÀÅ", "ಪು");
		m.put("¥ÀÇ", "ಪೂ");
		m.put("¥sÀÅ", "ಫು");
		m.put("¥sÀÇ", "ಫೂ");
		m.put("ªË", "ವೌ");
		m.put("±ï", "ಶ್");
		m.put("±À", "ಶ");
		m.put("±Á", "ಶಾ");
		m.put("²", "ಶಿ");
		m.put("±É", "ಶೆ");
		m.put("±Ë", "ಶೌ");
		m.put("µï", "ಷ್");
		m.put("µÀ", "ಷ");
		m.put("µÁ", "ಷಾ");
		m.put("¶", "ಷಿ");
		m.put("µÉ", "ಷೆ");
		m.put("µË", "ಷೌ");
		m.put("¸ï", "ಸ್");
		m.put("¸À", "ಸ");
		m.put("¸Á", "ಸಾ");
		m.put("¹", "ಸಿ");
		m.put("¸É", "ಸೆ");
		m.put("¸Ë", "ಸೌ");
		m.put("ºï", "ಹ್");
		m.put("ºÀ", "ಹ");
		m.put("ºÁ", "ಹಾ");
		m.put("»", "ಹಿ");
		m.put("ºÉ", "ಹೆ");
		m.put("ºË", "ಹೌ");
		m.put("¼ï", "ಳ್");
		m.put("¼À", "ಳ");
		m.put("¼Á", "ಳಾ");
		m.put("½", "ಳಿ");
		m.put("¼É", "ಳೆ");
		m.put("¼Ë", "ಳೌ");
		mapping = Collections.unmodifiableMap(m);
	}
	private static final Map<String, String> broken_cases;
	static {
		HashMap<String, String> bc = new HashMap<String, String>();
		// These when joined will be broken as per unicode
		bc.put("Ã", "ೀ");
		bc.put("Ä", "ು");
		bc.put("Æ", "ೂ");
		bc.put("È", "ೃ");
		bc.put("Ê", "ೈ");
		broken_cases = Collections.unmodifiableMap(bc);
	}
	private static final Map<String, Integer> bc_map_id;

	static {
		HashMap<String, Integer> bcm = new HashMap<String, Integer>();
		bcm.put("Ã", new Integer(1));
		bcm.put("Ä", new Integer(0));
		bcm.put("Æ", new Integer(2));
		bcm.put("È", new Integer(0));
		bcm.put("Ê", new Integer(3));
		bc_map_id = Collections.unmodifiableMap(bcm);
	}
	private static final Map<String, String> bc_map_1;

	static {
		HashMap<String, String> bcm1 = new HashMap<String, String>();
		bcm1.put("ಿ", "ೀ");
		bcm1.put("ೆ", "ೇ");
		bcm1.put("ೊ", "ೋ");
		bc_map_1 = Collections.unmodifiableMap(bcm1);
	}
	private static final Map<String, String> bc_map_2;

	static {
		HashMap<String, String> bcm2 = new HashMap<String, String>();
		bcm2.put("ೆ", "ೊ");
		bc_map_2 = Collections.unmodifiableMap(bcm2);
	}

	private static final Map<String, String> bc_map_3;

	static {
		HashMap<String, String> bcm3 = new HashMap<String, String>();
		bcm3.put("ೆ", "ೈ");
		bc_map_3 = Collections.unmodifiableMap(bcm3);
	}

	private static ArrayList<String> dependent_vowels = new ArrayList<String>();
	static {
		dependent_vowels.add("್");
		dependent_vowels.add("ಾ");
		dependent_vowels.add("ಿ");
		dependent_vowels.add("ೀ");
		dependent_vowels.add("ು");
		dependent_vowels.add("ೂ");
		dependent_vowels.add("ೃ");
		dependent_vowels.add("ೆ");
		dependent_vowels.add("ೇ");
		dependent_vowels.add("ೈ");
		dependent_vowels.add("ೊ");
		dependent_vowels.add("ೋ");
		dependent_vowels.add("ೌ");
	}
	private static final Map<String, String> ignore_list;
	static {
		HashMap<String, String> il = new HashMap<String, String>();
		il.put("ö", "");
		il.put("÷", "");
		ignore_list = Collections.unmodifiableMap(il);
	}

	private static final Map<String, String> vattaksharagalu;
	static {
		HashMap<String, String> v = new HashMap<String, String>();
		v.put("Ì", "ಕ");
		v.put("Í", "ಖ");
		v.put("Î", "ಗ");
		v.put("Ï", "ಘ");
		v.put("Õ", "ಞ");
		v.put("Ñ", "ಚ");
		v.put("Ò", "ಛ");
		v.put("Ó", "ಜ");
		v.put("Ô", "ಝ");
		v.put("Ö", "ಟ");
		v.put("×", "ಠ");
		v.put("Ø", "ಡ");
		v.put("Ù", "ಢ");
		v.put("Ú", "ಣ");
		v.put("Û", "ತ");
		v.put("Ü", "ಥ");
		v.put("Ý", "ದ");
		v.put("Þ", "ಧ");
		v.put("ß", "ನ");
		v.put("à", "ಪ");
		v.put("á", "ಫ");
		v.put("â", "ಬ");
		v.put("ã", "ಭ");
		v.put("ä", "ಮ");
		v.put("å", "ಯ");
		v.put("æ", "ರ");
		v.put("è", "ಲ");
		v.put("é", "ವ");
		v.put("ê", "ಶ");
		v.put("ë", "ಷ");
		v.put("ì", "ಸ");
		v.put("í", "ಹ");
		v.put("î", "ಳ");
		v.put("ç", "ರ");
		vattaksharagalu = Collections.unmodifiableMap(v);
	}

	private static final Map<String, String> ascii_arkavattu;
	static {
		HashMap<String, String> aa = new HashMap<String, String>();

		aa.put("ð", "ರ");
		ascii_arkavattu = Collections.unmodifiableMap(aa);
	}

	private static ArrayList<String> op;
	
	public String convert(String kn) {
		ArrayList<String> aOut = new ArrayList<String>();

		String[] words = kn.split(" ");
		for (String word : words) {
			aOut.add(processWord(word));
		}
		return join(aOut, " ");
	}
	
	private String processWord(String word) {
		// Initialize op
		op = new ArrayList<String>();
		int maxLen = word.length();
		int i = 0;
		
		while (i < maxLen) {

			// For each letter in word, jump if data[0] is more than zero

			// If additional chars used in ASCII to improve readability,
			// which doesn't have any significant in unicode
			if (ignore_list.containsKey(String.valueOf(word.charAt(i)))) {
				i += 1;
				continue;
			}
			// Find the mapping data
			int data = find_mapping(word, i);

			// Jump if data > 0 which means found a match for more than
			// one letter combination
			i += (1 + data);
		}
		return join(op, "");
	}

	private int find_mapping(String txt, int current_pos) {
		// Finds mapping in reverse order, For Example if input string
		// is abcde then itteration will be for abcde, abcd, abc, ab, a
		// Only when mapping available the index jumps, say if mapping
		// available for ab
		// then subtract length of ab while processing next

		// Combination length, if length remaining is less than max len then
		// Consider length remaining as max length
		// remaining length = len(txt) - current_pos
		int max_len = 4;
		int remaining = txt.length() - current_pos;
		if (remaining < 5) {
			max_len = (remaining - 1);
		}
		
		// Number of letters found mapping, will be returned to caller and
		// used to jump the index (Zero if one char found mapping)
		int n = 0;
		String zwj = "\u200d‍";

		// Loop 4 to 0 or max to 0
		// Controller which checks direct mapping,
		// arkavattu, vattaksharagalu and broken cases
		for (int i = max_len; i >= 0; i--) {
			int substr_till = current_pos + i + 1;
			String t = txt.substring(current_pos, substr_till);

			if (mapping.containsKey(t)) {
				// If prev char is halant and current char is not vattakshara?
				// then it must be seperated using ZWJ, so that it will not
				// mix with prev char.
				int len = op.size();
				if (len > 1) {
					if (op.get(len - 1).matches("/್$/")) {
						op.add(zwj);
					}
				}
				// Direct mapping case
				op.add(mapping.get(t));

				// Update Jump by number
				n = i;

				// Break and return to caller since we found the mapping
				// for given input
				break;
			} else {
				// Try without processing till reaches to last char
				if (i > 0) {
					continue;
				}
				// If Last in this batch
				if (ascii_arkavattu.containsKey(t)) {
					// Arkavattu
					process_arkavattu(t);
				} else if (vattaksharagalu.containsKey(t)) {
					// Vattakshara
					process_vattakshara(t);
				} else if (broken_cases.containsKey(t)) {
					// Broken cases
					process_broken_cases(t);
				} else {
					// No match
					op.add(t);
				}
			}
		}
		return n;
	}

	private void process_broken_cases(String t) {
		// Since ASCII mapping are based on shapes some of the shapes
		// give trouble with direct conversion
		// Ex: ಕೀರ್ತಿ and ಕೇಳಿ In ASCII: deerga has same code in both but in
		// Unicode both are different, So if prev char is "ಇ" kaara then
		// behave differently and also with "ಎ" kaara
		// Look at the prev char and also current char t and decide on the
		// single unicode
		// dependent vowel and substitute.
		// Note prev char + current char = new char (Except ಉ kaara, ಕು = ಕ + ಉ
		// kaara)
		// since prev char is not dependent vowel

		// Get dependent vowel mapping with respect to input "t"
		int bc_map_idx = bc_map_id.get(t);
		Map<String, String> bc_map = null;
		switch (bc_map_idx) {
		case 0:
			// For ಉ kaara, no mapping, substitute the value
			op.add(broken_cases.get(t));
			return;
		case 1:
			bc_map = bc_map_1;
			break;
		case 2:
			bc_map = bc_map_2;
			break;
		case 3:
			bc_map = bc_map_3;
			break;
		}
		// Defaults
		String last_letter = "";

		int len = op.size();
		// If atleast one letter in letters, to find the last letter value
		if (len > 0) {
			last_letter = op.get(len - 1);
			last_letter = String.valueOf(last_letter.charAt(last_letter
					.length() - 1));
		}
		String x = op.get(len - 1);
		int lcl = x.length();
		if (lcl > 1) {
			StringBuilder q = new StringBuilder();
			for (int zz = 0; zz < lcl; ++zz) {
				if (zz == lcl - 1) {
					q.append(bc_map.get(last_letter));
				} else {
					q.append(x.charAt(zz));
				}
			}
			x = q.toString();
		}
		op.set(len - 1, x);
	}

	private void process_vattakshara(String t) {
		// Current char is t, which is ASCII code of vattakshara
		// Rearrangement of string needed, If prev char is dependent vowel
		// then it has to be moved after vattakshara
		// If no dependent vowel then it is "ಅ" kaara, Ex: ಕ, ಗ
		// Vattakshara shares same code as of base letter, but halant is added
		// before
		// Ex: ತಿಮ್ಮಿ in ASCII: ತಿ + ಮಿ + ma_vattu
		// in Unicode: ತ + dependent vowel ಇ + ಮ + halant + ಮ + dependent vowel
		// ಇ

		// Default values
		String last_letter = "";
		
		int len = op.size();
		// If atleast one letter in letters, to find the last letter value
		if (len > 0) {
			last_letter = op.get(len - 1);
			last_letter = String.valueOf(last_letter.charAt(last_letter
				.length() - 1));
		}
		
		if (dependent_vowels.contains(last_letter)) {
			// If last letter/prev letter to vattakshara is dependent vowel
			// add dependent vowel at the end, after halant + base
			// letter(=vattakshara)
			String x = op.get(len - 1);
			int lcl = x.length();
			if (lcl > 1) {
				StringBuilder q = new StringBuilder();
				for (int zz = 0; zz < lcl; ++zz) {
					if (zz == lcl - 1) {
						q.append("್");
					} else {
						q.append(x.charAt(zz));
					}
				}
				x = q.toString();
			}
			op.set(len - 1, x);
			op.add(vattaksharagalu.get(t));
			op.add(last_letter);
		} else {
			// If "ಅ" kaara, just append halant + base letter
			// No worry about rearranging
			op.add("್");
			op.add(vattaksharagalu.get(t));
		}
	}

	private void process_arkavattu(String t) {
		// Example: ವರ್ಷ in ASCII ವ + ಷ + arkavattu
		// in Unicode ವ + ರ + halant + ಷ
		String last_letter = "";
		String second_last = "";
		
		int len = op.size();
		// If atleast one letter in letters, to find the last letter value
		if (len > 0) {
			last_letter = op.get(len - 1);
			last_letter = String.valueOf(last_letter.charAt(last_letter
					.length() - 1));
		}

		// If atleast two letters in letters, to find the second last letter
		// value
		if (len > 1) {
			second_last = op.get(len - 2);
			second_last = String.valueOf(second_last.charAt(second_last
					.length() - 1));
		}
		// Rearrangement according to above example
		if (dependent_vowels.contains(last_letter)) {
			op.set(len - 2, ascii_arkavattu.get(t));
			op.set(len - 1, "್");
			op.add(second_last);
			op.add(last_letter);
		} else {
			op.set(len - 1, ascii_arkavattu.get(t));
			op.add("್");
			op.add(last_letter);
		}
	}

	private String join(ArrayList<String> s, String glue) {
		int k = s.size();
		if (k == 0) {
			return "";
		}
		StringBuilder out = new StringBuilder();
		out.append(s.get(0));
		for (int x = 1; x < k; ++x) {
			out.append(glue).append(s.get(x));
		}
		return out.toString();
	}
}
