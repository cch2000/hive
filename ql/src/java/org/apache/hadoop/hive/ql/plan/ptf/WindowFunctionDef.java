package org.apache.hadoop.hive.ql.plan.ptf;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator;

public class WindowFunctionDef extends WindowExpressionDef {
  String name;
  boolean isStar;
  boolean isDistinct;
  List<PTFExpressionDef> args;
  WindowFrameDef windowFrame;
  GenericUDAFEvaluator wFnEval;
  boolean pivotResult;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isStar() {
    return isStar;
  }

  public void setStar(boolean isStar) {
    this.isStar = isStar;
  }

  public boolean isDistinct() {
    return isDistinct;
  }

  public void setDistinct(boolean isDistinct) {
    this.isDistinct = isDistinct;
  }

  public List<PTFExpressionDef> getArgs() {
    return args;
  }

  public void setArgs(List<PTFExpressionDef> args) {
    this.args = args;
  }

  public void addArg(PTFExpressionDef arg) {
    args = args == null ? new ArrayList<PTFExpressionDef>() : args;
    args.add(arg);
  }

  public WindowFrameDef getWindowFrame() {
    return windowFrame;
  }

  public void setWindowFrame(WindowFrameDef windowFrame) {
    this.windowFrame = windowFrame;
  }

  public GenericUDAFEvaluator getWFnEval() {
    return wFnEval;
  }

  public void setWFnEval(GenericUDAFEvaluator wFnEval) {
    this.wFnEval = wFnEval;
  }

  public boolean isPivotResult() {
    return pivotResult;
  }

  public void setPivotResult(boolean pivotResult) {
    this.pivotResult = pivotResult;
  }

}