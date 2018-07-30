package com.iotek.model;

import java.io.Serializable;

/**
 * Created by thinkpad on 2018/7/27.
 */
public class Resume implements Serializable {
    //������
    private int id;
    private String name;
    private String sex;
    private String education;
    private String major;
    private String phone;
    private String dob;//��������
    private String gt;//��ҵʱ��
    private String nation;
    private String np;//����
    private String address;
    private int age;
    public Resume() {
    }

    public Resume(int id, String name, String sex, String education, String major, String phone, String dob, String gt, String nation, String np, String address, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.education = education;
        this.major = major;
        this.phone = phone;
        this.dob = dob;
        this.gt = gt;
        this.nation = nation;
        this.np = np;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", ����='" + name + '\'' +
                ", �Ա�='" + sex + '\''+
                ", �Ա�='" + sex + '\'' +
                ", ѧ��='" + education + '\'' +
                ", רҵ='" + major + '\'' +
                ", �绰='" + phone + '\'' +
                ", ��������='" + dob + '\'' +
                ", ��ҵʱ��='" + gt + '\'' +
                ", ����='" + nation + '\'' +
                ", ����='" + np + '\'' +
                ", סַ='" + address + '\'' +
                '}';
    }
}
