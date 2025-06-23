package stone;
import static stone.Parser.*;

import stone.ast.Fun;

public class ClosureParser extends FuncParser{
	public ClosureParser() {
		primary.insertChoice(rule(Fun.class)
								.sep("fun").ast(paramList).ast(block));
	}
}