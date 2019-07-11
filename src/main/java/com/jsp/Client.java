package com.jsp;

import java.util.Objects;

public class Client {
    private Long id;
    private String name;
    private String document;
    private Integer age;

    public Client() {
    }

    public Client(Long id, String name, String document, Integer age) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(name, client.name) &&
                Objects.equals(document, client.document) &&
                Objects.equals(age, client.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, document, age);
    }
}
