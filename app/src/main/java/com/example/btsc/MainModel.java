package com.example.btsc;

public class MainModel {
    String date, EpinSN, name, phone, narrative, bank , depositdate, bankrefno,	fsno, materialsreceived, mrdate,
           branch, materialsreceivedby, registered, region, geneder;

    MainModel()
    {

    }

    public MainModel(String date, String epinSN, String name, String phone, String narrative, String bank, String depositdate, String bankrefno, String fsno, String materialsreceived, String mrdate, String branch, String materialsreceivedby, String registered, String region, String geneder) {
        this.date = date;
        this.EpinSN = epinSN;
        this.name = name;
        this.phone = phone;
        this.narrative = narrative;
        this.bank = bank;
        this.depositdate = depositdate;
        this.bankrefno = bankrefno;
        this.fsno = fsno;
        this.materialsreceived = materialsreceived;
        this.mrdate = mrdate;
        this.branch = branch;
        this.materialsreceivedby = materialsreceivedby;
        this.registered = registered;
        this.region = region;
        this.geneder = geneder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEpinSN() {
        return EpinSN;
    }

    public void setEpinSN(String epinSN) {
        EpinSN = epinSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getDepositdate() {
        return depositdate;
    }

    public void setDepositdate(String depositdate) {
        this.depositdate = depositdate;
    }

    public String getBankrefno() {
        return bankrefno;
    }

    public void setBankrefno(String bankrefno) {
        this.bankrefno = bankrefno;
    }

    public String getFsno() {
        return fsno;
    }

    public void setFsno(String fsno) {
        this.fsno = fsno;
    }

    public String getMaterialsreceived() {
        return materialsreceived;
    }

    public void setMaterialsreceived(String materialsreceived) {
        this.materialsreceived = materialsreceived;
    }

    public String getMrdate() {
        return mrdate;
    }

    public void setMrdate(String mrdate) {
        this.mrdate = mrdate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMaterialsreceivedby() {
        return materialsreceivedby;
    }

    public void setMaterialsreceivedby(String materialsreceivedby) {
        this.materialsreceivedby = materialsreceivedby;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGeneder() {
        return geneder;
    }

    public void setGeneder(String geneder) {
        this.geneder = geneder;
    }
}
