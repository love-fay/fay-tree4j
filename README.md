# fay-tree4j
java中将有子父级关系的list集合转出树形结构

####将有父子关系的实体类实现IFayTreeNode接口，然后调用FayTreeUtil的getTreeInJsonObject方法，参数为该实体的list集合，返回具有树形结构的JSON对象，格式为<pre>{“treeObject”：{...}，"children"：[{...}]}</pre>

####This is [an example](https://github.com/love-fay/fay-tree4j/blob/master/src/main/java/com/fay/tree/TreeDemo.java).