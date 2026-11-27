package com.gla.Recursion;

import java.util.*;
public class DirectorySizeCalculator {
    static class FileNode {
        String name;
        int size;
        ArrayList<FileNode> children;

        FileNode(String name, int size) {
            this.name = name;
            this.size = size;
            children = new ArrayList<>();
        }
    }

    static int calculateSize(FileNode node) {
        if (node.children.isEmpty()) {
            return node.size;
        }

        int total = 0;

        for (FileNode child : node.children) {
            total += calculateSize(child);
        }

        return total;
    }

    public static void main(String[] args) {
        FileNode root = new FileNode("project", 0);
        FileNode src = new FileNode("src", 0);
        FileNode docs = new FileNode("docs", 0);
        FileNode guides = new FileNode("guides", 0);

        src.children.add(new FileNode("main.java", 100));
        src.children.add(new FileNode("utils.java", 50));

        guides.children.add(new FileNode("setup.pdf", 200));

        docs.children.add(new FileNode("readme.txt", 10));
        docs.children.add(guides);

        root.children.add(src);
        root.children.add(docs);
        root.children.add(new FileNode("config.xml", 20));

        System.out.println(calculateSize(root) + " KB");
    }
}
