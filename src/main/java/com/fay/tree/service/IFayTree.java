package com.fay.tree.service;

import java.util.List;

import com.fay.tree.domain.FayTreeNode;

public interface IFayTree {
	List<FayTreeNode> getTree();
    List<FayTreeNode> getRoot();
    FayTreeNode getFayTreeNode(String nodeId);
}
