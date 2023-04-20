public class indovinaParola{
    //attributi
    String parolaIndovinare;
    int nTentativi;
    int tentativiSbagliati;
    char arrparola [];

    //costruttore
    indovinaParola(String word)throws Exception{
        int i;
        if(word.length()>=1){
            parolaIndovinare = word;
            arrparola = new char[word.length()];
            for(i = 0; i< word.length();i++){
                arrparola[i] = '?';
                if(word.charAt(i) == ' '){
                    throw new Exception("La parola contiene uno spazio");
                }

            }
            nTentativi = 0;
        }else{
            throw new Exception("Lunghezza invalida");
        }
    }

    public void indovina(char carattere){
        int i;
        boolean flag = true;
        nTentativi++;
        for(i = 0; i<arrparola.length; i++){
            if(parolaIndovinare.charAt(i)== carattere){
                arrparola[i] = carattere;
                flag = false;
            }
        }
        if(!flag){
            tentativiSbagliati++;
        }
    }

    public String getParolaScoperta(){
        String stringa = "";
        int i;
        for(i =0; i<arrparola.length; i++){
            stringa = stringa + arrparola[i];
        }
        return stringa;
    }

    public String getPatolaDaIndovinare(){
        return parolaIndovinare;
    }

    public  int getNumeroTentativi(){
        return nTentativi;
    }


    public boolean isIndovinata(){
        boolean indovinata = false;
        int i=0;
        while(i<arrparola.length && !indovinata){
            if(arrparola[i]== '?'){
                indovinata = true;
            }
            i++;
        }
        return !indovinata;

    }
}