/**
 * generated by Xtext 2.12.0
 */
package com.kaleidoscope.usecase.showcase.xtext.employeeDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeDslPackage#getEmployeeContainer()
 * @model
 * @generated
 */
public interface EmployeeContainer extends EObject
{
  /**
   * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
   * The list contents are of type {@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employees</em>' containment reference list.
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeDslPackage#getEmployeeContainer_Employees()
   * @model containment="true"
   * @generated
   */
  EList<Employee> getEmployees();

} // EmployeeContainer