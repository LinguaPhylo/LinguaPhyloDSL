/*
 * generated by Xtext 2.25.0
 */
package lphy.dsl.ui;

import com.google.inject.Injector;
import lphyDSL.ui.internal.LphyDSLActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LPhyExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(LphyDSLActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		LphyDSLActivator activator = LphyDSLActivator.getInstance();
		return activator != null ? activator.getInjector(LphyDSLActivator.LPHY_DSL_LPHY) : null;
	}

}
