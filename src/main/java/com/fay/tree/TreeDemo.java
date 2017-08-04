package com.fay.tree;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.fay.tree.domain.Org;
import com.fay.tree.service.IFayTreeNode;
import com.fay.tree.util.FayTreeUtil;

public class TreeDemo {
	
	public static void main(String[] args) {
		Object data = FayTreeUtil.getTreeInJsonObject(genFayOrgList());
		System.out.println(JSONObject.toJSONString(data));
	}

	public static List<IFayTreeNode> genFayOrgList() {
		List<IFayTreeNode> list = new ArrayList<IFayTreeNode>();

		Org org = new Org("2", "1", "北京市", "110000", "2");
		list.add(org);
		org = new Org("3", "2", "市辖区", "110100", "3");
		list.add(org);
		org = new Org("4", "3", "东城区", "110101", "4");
		list.add(org);
		org = new Org("5", "3", "东城区", "110102", "4");
		list.add(org);
		org = new Org("6", "3", "东城区", "110105", "4");
		list.add(org);
		org = new Org("7", "3", "东城区", "110106", "4");
		list.add(org);
		org = new Org("8", "3", "东城区", "110107", "4");
		list.add(org);
		org = new Org("9", "3", "东城区", "110108", "4");
		list.add(org);
		org = new Org("10", "3", "东城区", "110109", "4");
		list.add(org);
		org = new Org("11", "3", "东城区", "110111", "4");
		list.add(org);
		org = new Org("12", "3", "东城区", "110112", "4");
		list.add(org);
		org = new Org("13", "3", "东城区", "110113", "4");
		list.add(org);
		org = new Org("14", "3", "东城区", "110114", "4");
		list.add(org);
		org = new Org("15", "3", "东城区", "110115", "4");
		list.add(org);
		org = new Org("16", "3", "东城区", "110116", "4");
		list.add(org);
		org = new Org("17", "3", "东城区", "110117", "4");
		list.add(org);
		org = new Org("18", "2", "县", "110200", "3");
		list.add(org);
		org = new Org("19", "18", "密云县", "110228", "4");
		list.add(org);
		org = new Org("20", "18", "延庆县", "110229", "4");
		list.add(org);
		return list;
	}
}
