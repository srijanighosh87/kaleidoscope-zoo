/**
 * generated by Xtext 2.12.0
 */
package com.kaleidoscope.usecase.showcase.xtext.personDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kaleidoscope.usecase.showcase.xtext.personDsl.Person#getID <em>ID</em>}</li>
 *   <li>{@link com.kaleidoscope.usecase.showcase.xtext.personDsl.Person#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.kaleidoscope.usecase.showcase.xtext.personDsl.PersonDslPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(int)
   * @see com.kaleidoscope.usecase.showcase.xtext.personDsl.PersonDslPackage#getPerson_ID()
   * @model
   * @generated
   */
  int getID();

  /**
   * Sets the value of the '{@link com.kaleidoscope.usecase.showcase.xtext.personDsl.Person#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.kaleidoscope.usecase.showcase.xtext.personDsl.PersonDslPackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.kaleidoscope.usecase.showcase.xtext.personDsl.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Person
