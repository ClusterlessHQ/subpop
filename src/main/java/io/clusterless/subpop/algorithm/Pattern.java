package io.clusterless.subpop.algorithm;

import io.clusterless.subpop.algorithm.items.Item;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Pattern {
    int classIndex;
    List<Item> items = new LinkedList<>();
    int support;

    public Pattern() {
    }

    public Pattern(Pattern alpha) {
        this.classIndex = alpha.classIndex;
        this.items = new LinkedList<>(alpha.items);
        this.support = alpha.support;
    }

    public Pattern(int classIndex, List<Item> items, int support) {
        this.classIndex = classIndex;
        this.items = items;
        this.support = support;
    }

    public Pattern(Pattern pattern, Item item) {
        this(pattern);
        items.add(item);
    }

    public void setClassIndex(int classIndex) {
        this.classIndex = classIndex;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setSupport(int support) {
        this.support = support;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pattern pattern = (Pattern) o;
        return classIndex == pattern.classIndex && support == pattern.support && Objects.equals(items, pattern.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classIndex, items, support);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pattern{");
        sb.append("classIndex=").append(classIndex);
        sb.append(", items=").append(items);
        sb.append(", support=").append(support);
        sb.append('}');
        return sb.toString();
    }
}