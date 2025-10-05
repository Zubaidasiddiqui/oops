package Rationall;
public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator=0;
        this.denominator=1;
    }
    public Rational(int numerator,int denominator){
        if(denominator==0){
            throw new MatchException("Denominator cannot be zero", null);
        }
        int gcd= gcd(numerator,denominator);
        this.numerator=numerator/gcd;
        this.denominator=denominator/gcd;
    }

    public void setNumerator(int numerator){
        this.numerator=numerator;
    }
    public void setDenominator(int denominator){
        this.denominator=denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public Rational add(Rational other){
        int numerator=(this.numerator*other.denominator)+(this.denominator*other.numerator);
        int denominator=this.denominator*other.denominator;
        Rational myRational=new Rational(numerator,denominator);
        return myRational;
    }
    public Rational subtract(Rational other){
        int numerator=(this.numerator*other.denominator)-(this.denominator*other.numerator);
        int denominator=this.denominator*other.denominator;
        Rational myRational=new Rational(numerator,denominator);
        return myRational;
    }
    public Rational multiply(Rational other){
        int numerator=this.numerator*other.numerator;
        int denominator=this.denominator*other.denominator;
        Rational myRational=new Rational(numerator,denominator);
        return myRational;
    }
    public Rational divide(Rational other){
        if(other.numerator==0){
            throw new MatchException("Numerator cannot be zero", null);
        }
        int numerator=this.numerator*other.denominator;
        int denominator=this.denominator*other.numerator;
        Rational myRational=new Rational(numerator,denominator);
        return myRational;
    }
    public int gcd(int numerator,int denominator){
        if(denominator==0)
        return numerator;
        return gcd(denominator,numerator % denominator);
    }
    @Override
    public String toString(){
        if(denominator==1)
        return String.valueOf(numerator);
        return numerator+"/"+denominator;
    }
}
