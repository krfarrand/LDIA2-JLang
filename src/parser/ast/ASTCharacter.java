/* Generated By:JJTree: Do not edit this line. ASTCharacter.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=intepreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTCharacter extends SimpleNode {
  public ASTCharacter(int id) {
    super(id);
  }

  public ASTCharacter(Jlang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JlangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=50cc174359d0ede8aef50cd8c565f717 (do not edit this line) */
