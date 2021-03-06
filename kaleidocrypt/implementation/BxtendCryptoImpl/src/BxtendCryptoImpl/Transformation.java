/**
 */
package BxtendCryptoImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BxtendCryptoImpl.Transformation#getCorrespondences <em>Correspondences</em>}</li>
 *   <li>{@link BxtendCryptoImpl.Transformation#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link BxtendCryptoImpl.Transformation#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 *
 * @see BxtendCryptoImpl.BxtendCryptoImplPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link BxtendCryptoImpl.Corr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspondences</em>' containment reference list.
	 * @see BxtendCryptoImpl.BxtendCryptoImplPackage#getTransformation_Correspondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Corr> getCorrespondences();

	/**
	 * Returns the value of the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Model</em>' reference.
	 * @see #setSourceModel(EObject)
	 * @see BxtendCryptoImpl.BxtendCryptoImplPackage#getTransformation_SourceModel()
	 * @model
	 * @generated
	 */
	EObject getSourceModel();

	/**
	 * Sets the value of the '{@link BxtendCryptoImpl.Transformation#getSourceModel <em>Source Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model</em>' reference.
	 * @see #getSourceModel()
	 * @generated
	 */
	void setSourceModel(EObject value);

	/**
	 * Returns the value of the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Model</em>' reference.
	 * @see #setTargetModel(EObject)
	 * @see BxtendCryptoImpl.BxtendCryptoImplPackage#getTransformation_TargetModel()
	 * @model
	 * @generated
	 */
	EObject getTargetModel();

	/**
	 * Sets the value of the '{@link BxtendCryptoImpl.Transformation#getTargetModel <em>Target Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Model</em>' reference.
	 * @see #getTargetModel()
	 * @generated
	 */
	void setTargetModel(EObject value);

} // Transformation
