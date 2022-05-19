package binar.ganda.depedencyinjectionexample.latihan

class Nilai {
    fun konversiNilai(score : Int) : String{
        return if (score <= 100 && score >= 85) {
            "A"
        } else if(score < 85 && score >= 75){
            "B"
        } else if(score < 75 && score >= 60){
            "C"
        } else if (score < 60 && score <= 50){
            "D"
        } else {
            "E"
        }
    }
}