package org.fandev.runner;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;
import com.intellij.execution.configurations.ConfigurationTypeUtil;
import consulo.fantom.FantomIcons;

/**
 * Date: Sep 16, 2009
 * Time: 11:30:20 PM
 *
 * @author Dror Bereznitsky
 */
public class FanTestRunConfigurationType extends FanRunConfigurationType
{
	public FanTestRunConfigurationType()
	{
		super();
		configurationFactory = new FanTestConfigurationFactory(this);
	}

	public String getDisplayName()
	{
		return "Fantom Test";
	}

	public String getConfigurationTypeDescription()
	{
		return "Fantom Test";
	}

	public Icon getIcon()
	{
		return FantomIcons.Fantom;
	}

	@NotNull
	public String getId()
	{
		return "FanTestRunConfiguration";
	}

	public static FanTestRunConfigurationType getInstance()
	{
		return ConfigurationTypeUtil.findConfigurationType(FanTestRunConfigurationType.class);
	}
}

