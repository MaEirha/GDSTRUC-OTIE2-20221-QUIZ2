package com.gdstruc.module2;

public class UlamNode {
    private Ulam ulam;
    private UlamNode nextUlam;

    public UlamNode(com.gdstruc.module2.Ulam ulam) {
        this.ulam = ulam;
    }

    public com.gdstruc.module2.Ulam getUlam() {
        return ulam;
    }

    public String getUlamName(){
        String name = this.ulam.getName();
        return name;
    }

    public void setUlam(com.gdstruc.module2.Ulam ulam) {
        this.ulam = ulam;
    }

    public com.gdstruc.module2.UlamNode getNextUlam() {
        return nextUlam;
    }

    public void setNextUlam(com.gdstruc.module2.UlamNode nextUlam) {
        this.nextUlam = nextUlam;
    }

    @Override
    public String toString() {
        return "UlamNode{" +
                "ulam=" + ulam +
                ", nextUlam=" + nextUlam +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.gdstruc.module2.UlamNode ulamNode = (com.gdstruc.module2.UlamNode) o;
        return java.util.Objects.equals(ulam, ulamNode.ulam) && java.util.Objects.equals(nextUlam, ulamNode.nextUlam);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(ulam, nextUlam);
    }
}
