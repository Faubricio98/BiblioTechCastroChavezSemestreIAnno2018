/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author faubricioch
 */
public class LoanCAv extends Audiovisuales{
    private String loanDate;
    private String backLoanDate;

    public LoanCAv() {
        super();
    }

    public LoanCAv(String loanDate, String backLoanDate, String dispositive, String brand, int registerNumber, boolean condition, String entryDate, boolean availability) {
        super(dispositive, brand, registerNumber, condition, entryDate, availability);
        this.loanDate = loanDate;
        this.backLoanDate = backLoanDate;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getBackLoanDate() {
        return backLoanDate;
    }

    public void setBackLoanDate(String backLoanDate) {
        this.backLoanDate = backLoanDate;
    }
    
    public int sizeInBytes(){
        return super.sizeInBytes() + this.loanDate.length()*2 +
                this.backLoanDate.length()*2;
    }
}
