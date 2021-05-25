/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy;

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
 * @see lphy.dsl.lPhy.LPhyFactory
 * @model kind="package"
 * @generated
 */
public interface LPhyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lPhy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsl.lphy/LPhy";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lPhy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LPhyPackage eINSTANCE = lphy.dsl.lPhy.impl.LPhyPackageImpl.init();

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.LPhyModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.LPhyModelImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getLPhyModel()
   * @generated
   */
  int LPHY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_MODEL__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_MODEL__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_MODEL__NAME = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_MODEL__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Law Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_MODEL__LAW_NODES = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.LawNodeImpl <em>Law Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.LawNodeImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getLawNode()
   * @generated
   */
  int LAW_NODE = 1;

  /**
   * The number of structural features of the '<em>Law Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAW_NODE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.InstantiatedDistributionImpl <em>Instantiated Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.InstantiatedDistributionImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getInstantiatedDistribution()
   * @generated
   */
  int INSTANTIATED_DISTRIBUTION = 2;

  /**
   * The feature id for the '<em><b>Generated Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES = LAW_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATED_DISTRIBUTION__TYPE_SPEC = LAW_NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Explicit Arguments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATED_DISTRIBUTION__EXPLICIT_ARGUMENTS = LAW_NODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATED_DISTRIBUTION__ARGUMENTS = LAW_NODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Instantiated Distribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATED_DISTRIBUTION_FEATURE_COUNT = LAW_NODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.ArgumentImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.VariableImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__RANGE = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.RangeImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getRange()
   * @generated
   */
  int RANGE = 5;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__END = 1;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.DistributionTypeSpecificationImpl <em>Distribution Type Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.DistributionTypeSpecificationImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getDistributionTypeSpecification()
   * @generated
   */
  int DISTRIBUTION_TYPE_SPECIFICATION = 6;

  /**
   * The number of structural features of the '<em>Distribution Type Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_TYPE_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.LPhyDistImpl <em>Dist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.LPhyDistImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getLPhyDist()
   * @generated
   */
  int LPHY_DIST = 7;

  /**
   * The feature id for the '<em><b>Distribution Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_DIST__DISTRIBUTION_TYPE = DISTRIBUTION_TYPE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPHY_DIST_FEATURE_COUNT = DISTRIBUTION_TYPE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lphy.dsl.lPhy.impl.JavaDistImpl <em>Java Dist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lphy.dsl.lPhy.impl.JavaDistImpl
   * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getJavaDist()
   * @generated
   */
  int JAVA_DIST = 8;

  /**
   * The feature id for the '<em><b>Distribution Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_DIST__DISTRIBUTION_TYPE = DISTRIBUTION_TYPE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Java Dist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_DIST_FEATURE_COUNT = DISTRIBUTION_TYPE_SPECIFICATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.LPhyModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see lphy.dsl.lPhy.LPhyModel
   * @generated
   */
  EClass getLPhyModel();

  /**
   * Returns the meta object for the attribute '{@link lphy.dsl.lPhy.LPhyModel#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see lphy.dsl.lPhy.LPhyModel#getPackage()
   * @see #getLPhyModel()
   * @generated
   */
  EAttribute getLPhyModel_Package();

  /**
   * Returns the meta object for the containment reference '{@link lphy.dsl.lPhy.LPhyModel#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see lphy.dsl.lPhy.LPhyModel#getImportSection()
   * @see #getLPhyModel()
   * @generated
   */
  EReference getLPhyModel_ImportSection();

  /**
   * Returns the meta object for the attribute '{@link lphy.dsl.lPhy.LPhyModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lphy.dsl.lPhy.LPhyModel#getName()
   * @see #getLPhyModel()
   * @generated
   */
  EAttribute getLPhyModel_Name();

  /**
   * Returns the meta object for the attribute list '{@link lphy.dsl.lPhy.LPhyModel#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see lphy.dsl.lPhy.LPhyModel#getParameters()
   * @see #getLPhyModel()
   * @generated
   */
  EAttribute getLPhyModel_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link lphy.dsl.lPhy.LPhyModel#getLawNodes <em>Law Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Law Nodes</em>'.
   * @see lphy.dsl.lPhy.LPhyModel#getLawNodes()
   * @see #getLPhyModel()
   * @generated
   */
  EReference getLPhyModel_LawNodes();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.LawNode <em>Law Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Law Node</em>'.
   * @see lphy.dsl.lPhy.LawNode
   * @generated
   */
  EClass getLawNode();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.InstantiatedDistribution <em>Instantiated Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiated Distribution</em>'.
   * @see lphy.dsl.lPhy.InstantiatedDistribution
   * @generated
   */
  EClass getInstantiatedDistribution();

  /**
   * Returns the meta object for the containment reference '{@link lphy.dsl.lPhy.InstantiatedDistribution#getGeneratedVariables <em>Generated Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generated Variables</em>'.
   * @see lphy.dsl.lPhy.InstantiatedDistribution#getGeneratedVariables()
   * @see #getInstantiatedDistribution()
   * @generated
   */
  EReference getInstantiatedDistribution_GeneratedVariables();

  /**
   * Returns the meta object for the containment reference '{@link lphy.dsl.lPhy.InstantiatedDistribution#getTypeSpec <em>Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Spec</em>'.
   * @see lphy.dsl.lPhy.InstantiatedDistribution#getTypeSpec()
   * @see #getInstantiatedDistribution()
   * @generated
   */
  EReference getInstantiatedDistribution_TypeSpec();

  /**
   * Returns the meta object for the attribute '{@link lphy.dsl.lPhy.InstantiatedDistribution#isExplicitArguments <em>Explicit Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Arguments</em>'.
   * @see lphy.dsl.lPhy.InstantiatedDistribution#isExplicitArguments()
   * @see #getInstantiatedDistribution()
   * @generated
   */
  EAttribute getInstantiatedDistribution_ExplicitArguments();

  /**
   * Returns the meta object for the containment reference list '{@link lphy.dsl.lPhy.InstantiatedDistribution#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see lphy.dsl.lPhy.InstantiatedDistribution#getArguments()
   * @see #getInstantiatedDistribution()
   * @generated
   */
  EReference getInstantiatedDistribution_Arguments();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see lphy.dsl.lPhy.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link lphy.dsl.lPhy.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lphy.dsl.lPhy.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for the containment reference '{@link lphy.dsl.lPhy.Argument#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see lphy.dsl.lPhy.Argument#getValue()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Value();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see lphy.dsl.lPhy.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link lphy.dsl.lPhy.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lphy.dsl.lPhy.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link lphy.dsl.lPhy.Variable#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see lphy.dsl.lPhy.Variable#getRange()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Range();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see lphy.dsl.lPhy.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the attribute '{@link lphy.dsl.lPhy.Range#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see lphy.dsl.lPhy.Range#getStart()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_Start();

  /**
   * Returns the meta object for the attribute '{@link lphy.dsl.lPhy.Range#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see lphy.dsl.lPhy.Range#getEnd()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_End();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.DistributionTypeSpecification <em>Distribution Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution Type Specification</em>'.
   * @see lphy.dsl.lPhy.DistributionTypeSpecification
   * @generated
   */
  EClass getDistributionTypeSpecification();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.LPhyDist <em>Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dist</em>'.
   * @see lphy.dsl.lPhy.LPhyDist
   * @generated
   */
  EClass getLPhyDist();

  /**
   * Returns the meta object for the reference '{@link lphy.dsl.lPhy.LPhyDist#getDistributionType <em>Distribution Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Distribution Type</em>'.
   * @see lphy.dsl.lPhy.LPhyDist#getDistributionType()
   * @see #getLPhyDist()
   * @generated
   */
  EReference getLPhyDist_DistributionType();

  /**
   * Returns the meta object for class '{@link lphy.dsl.lPhy.JavaDist <em>Java Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Dist</em>'.
   * @see lphy.dsl.lPhy.JavaDist
   * @generated
   */
  EClass getJavaDist();

  /**
   * Returns the meta object for the containment reference '{@link lphy.dsl.lPhy.JavaDist#getDistributionType <em>Distribution Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Distribution Type</em>'.
   * @see lphy.dsl.lPhy.JavaDist#getDistributionType()
   * @see #getJavaDist()
   * @generated
   */
  EReference getJavaDist_DistributionType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LPhyFactory getLPhyFactory();

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
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.LPhyModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.LPhyModelImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getLPhyModel()
     * @generated
     */
    EClass LPHY_MODEL = eINSTANCE.getLPhyModel();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LPHY_MODEL__PACKAGE = eINSTANCE.getLPhyModel_Package();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LPHY_MODEL__IMPORT_SECTION = eINSTANCE.getLPhyModel_ImportSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LPHY_MODEL__NAME = eINSTANCE.getLPhyModel_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LPHY_MODEL__PARAMETERS = eINSTANCE.getLPhyModel_Parameters();

    /**
     * The meta object literal for the '<em><b>Law Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LPHY_MODEL__LAW_NODES = eINSTANCE.getLPhyModel_LawNodes();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.LawNodeImpl <em>Law Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.LawNodeImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getLawNode()
     * @generated
     */
    EClass LAW_NODE = eINSTANCE.getLawNode();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.InstantiatedDistributionImpl <em>Instantiated Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.InstantiatedDistributionImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getInstantiatedDistribution()
     * @generated
     */
    EClass INSTANTIATED_DISTRIBUTION = eINSTANCE.getInstantiatedDistribution();

    /**
     * The meta object literal for the '<em><b>Generated Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES = eINSTANCE.getInstantiatedDistribution_GeneratedVariables();

    /**
     * The meta object literal for the '<em><b>Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATED_DISTRIBUTION__TYPE_SPEC = eINSTANCE.getInstantiatedDistribution_TypeSpec();

    /**
     * The meta object literal for the '<em><b>Explicit Arguments</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANTIATED_DISTRIBUTION__EXPLICIT_ARGUMENTS = eINSTANCE.getInstantiatedDistribution_ExplicitArguments();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATED_DISTRIBUTION__ARGUMENTS = eINSTANCE.getInstantiatedDistribution_Arguments();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.ArgumentImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.VariableImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__RANGE = eINSTANCE.getVariable_Range();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.RangeImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__START = eINSTANCE.getRange_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__END = eINSTANCE.getRange_End();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.DistributionTypeSpecificationImpl <em>Distribution Type Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.DistributionTypeSpecificationImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getDistributionTypeSpecification()
     * @generated
     */
    EClass DISTRIBUTION_TYPE_SPECIFICATION = eINSTANCE.getDistributionTypeSpecification();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.LPhyDistImpl <em>Dist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.LPhyDistImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getLPhyDist()
     * @generated
     */
    EClass LPHY_DIST = eINSTANCE.getLPhyDist();

    /**
     * The meta object literal for the '<em><b>Distribution Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LPHY_DIST__DISTRIBUTION_TYPE = eINSTANCE.getLPhyDist_DistributionType();

    /**
     * The meta object literal for the '{@link lphy.dsl.lPhy.impl.JavaDistImpl <em>Java Dist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lphy.dsl.lPhy.impl.JavaDistImpl
     * @see lphy.dsl.lPhy.impl.LPhyPackageImpl#getJavaDist()
     * @generated
     */
    EClass JAVA_DIST = eINSTANCE.getJavaDist();

    /**
     * The meta object literal for the '<em><b>Distribution Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_DIST__DISTRIBUTION_TYPE = eINSTANCE.getJavaDist_DistributionType();

  }

} //LPhyPackage
