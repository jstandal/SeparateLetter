package no.dnb.payment.separateletter.input;

import java.util.List;

public class SeparateLetterInput {
    private final String creditorName;
    private final String creditorAddress;
    private final String accountServiceRef;
    private final String debtorName;
    private final String debtorAddress;
    private final String date;
    private final String amount;
    private final String bankRef;
    private final String account;
    private final List<String> remittanceInformation;

    private SeparateLetterInput(SLBuilder builder) {
        this.creditorName = builder.creditorName;
        this.creditorAddress = builder.creditorAddress;
        this.accountServiceRef = builder.accountServiceRef;
        this.debtorName = builder.debtorName;
        this.debtorAddress = builder.debtorAddress;
        this.date = builder.date;
        this.amount = builder.amount;
        this.bankRef = builder.bankRef;
        this.account = builder.account;
        this.remittanceInformation = builder.remittanceInformation;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public String getCreditorAddress() {
        return creditorAddress;
    }

    public String getAccountServiceRef() {
        return accountServiceRef;
    }

    public String getDebtorName() {
        return debtorName;
    }

    public String getDebtorAddress() {
        return debtorAddress;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public String getBankRef() {
        return bankRef;
    }

    public String getAccount() {
        return account;
    }

    public List<String> getRemittanceInformation() {
        return remittanceInformation;
    }

    public static class SLBuilder
    {
        private  String creditorName;
        private  String creditorAddress;
        private  String accountServiceRef;
        private  String debtorName;
        private  String debtorAddress;
        private  String date;
        private  String amount;
        private  String bankRef;
        private  String account;
        private  List<String> remittanceInformation;

        public SLBuilder(){};

        public SLBuilder creditorName(String creditorName) {
            this.creditorName = creditorName;
            return this;
        }

        public SLBuilder creditorAddress(String creditorAddress){
            this.creditorAddress = creditorAddress;
            return this;
        }

        public SLBuilder accountServiceRef(String accountServiceRef){
            this.accountServiceRef = accountServiceRef;
            return this;
        }

        public SLBuilder debtorName(String debtorName){
            this.debtorName = debtorName;
            return this;
        }

        public SLBuilder debtorAddress(String debtorAddress){
            this.debtorAddress = debtorAddress;
            return this;
        }

        public SLBuilder date(String date){
            this.date = date;
            return this;
        }

        public SLBuilder amount(String amount){
            this.amount = amount;
            return this;
        }

        public SLBuilder bankRef(String bankRef){
            this.bankRef = bankRef;
            return this;
        }

        public SLBuilder account(String account){
            this.account = account;
            return this;
        }

        public SLBuilder remittanceInformation(List<String> remittanceInformation){
            this.remittanceInformation = remittanceInformation;
            return this;
        }

        public SeparateLetterInput build() {
            return new SeparateLetterInput(this);
        }
    }

}
