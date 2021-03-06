/**
 * generated by Xtext 2.12.0
 */
package com.kaleidoscope.usecase.showcase.xtext.employeeDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeDslFactory
 * @model kind="package"
 * @generated
 */
public interface EmployeeDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "employeeDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kaleidoscope.com/usecase/showcase/xtext/EmployeeDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "employeeDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmployeeDslPackage eINSTANCE = com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeContainerImpl <em>Employee Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeContainerImpl
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeDslPackageImpl#getEmployeeContainer()
   * @generated
   */
  int EMPLOYEE_CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Employees</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_CONTAINER__EMPLOYEES = 0;

  /**
   * The number of structural features of the '<em>Employee Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeImpl <em>Employee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeImpl
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeDslPackageImpl#getEmployee()
   * @generated
   */
  int EMPLOYEE = 1;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__NAME = 1;

  /**
   * The feature id for the '<em><b>Salary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__SALARY = 2;

  /**
   * The number of structural features of the '<em>Employee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer <em>Employee Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Employee Container</em>'.
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer
   * @generated
   */
  EClass getEmployeeContainer();

  /**
   * Returns the meta object for the containment reference list '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer#getEmployees <em>Employees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Employees</em>'.
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer#getEmployees()
   * @see #getEmployeeContainer()
   * @generated
   */
  EReference getEmployeeContainer_Employees();

  /**
   * Returns the meta object for class '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Employee</em>'.
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee
   * @generated
   */
  EClass getEmployee();

  /**
   * Returns the meta object for the attribute '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee#getID()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_ID();

  /**
   * Returns the meta object for the attribute '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee#getName()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_Name();

  /**
   * Returns the meta object for the attribute '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee#getSalary <em>Salary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Salary</em>'.
   * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee#getSalary()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_Salary();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EmployeeDslFactory getEmployeeDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeContainerImpl <em>Employee Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeContainerImpl
     * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeDslPackageImpl#getEmployeeContainer()
     * @generated
     */
    EClass EMPLOYEE_CONTAINER = eINSTANCE.getEmployeeContainer();

    /**
     * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPLOYEE_CONTAINER__EMPLOYEES = eINSTANCE.getEmployeeContainer_Employees();

    /**
     * The meta object literal for the '{@link com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeImpl <em>Employee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeImpl
     * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeDslPackageImpl#getEmployee()
     * @generated
     */
    EClass EMPLOYEE = eINSTANCE.getEmployee();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__ID = eINSTANCE.getEmployee_ID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

    /**
     * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__SALARY = eINSTANCE.getEmployee_Salary();

  }

} //EmployeeDslPackage
