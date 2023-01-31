package at.loacker.structuredprogramming;


class Ceasar {
        public static void main(String[] args) {
            String fullword = "geheimcode";
            int key = 3;
            String ceasarssecret = code(fullword, key);
            System.out.println("Ganzes Wort: " + fullword + " ---> " + ceasarssecret);
            String unraveled = decode(ceasarssecret, key);
            System.out.println("Verschlüsseltes Wort: " + ceasarssecret + " ---> " + unraveled);
        }


        public static String code(String fullword, int key) {
            String ceasarssecret = "";
            fullword = fullword.toLowerCase();

            for (int i = 0; i < fullword.length(); i++) {
                char next = fullword.charAt(i);
                ceasarssecret = ceasarssecret + shift(next, key);
            }return ceasarssecret;
        }

        public static char shift(char letter, int shift) {
            if (letter >= 'a' && letter <= 'z') {
                letter += shift;
                  while (letter > 'z') {
                    letter -= 26;
                }
            }return letter;
        }

        public static String decode(String ceasarssecret, int key) {
                String unraveled = "";
                ceasarssecret = ceasarssecret.toLowerCase();

            for (int i = 0; i < ceasarssecret.length(); i++) {
                char next = ceasarssecret.charAt(i);
                unraveled = unraveled + shift(next, 26 - key);
            }return unraveled;
        }
    }

