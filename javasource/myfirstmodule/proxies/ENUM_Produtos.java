// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum ENUM_Produtos
{
	SemEstoque(new java.lang.String[][] { new java.lang.String[] { "en_US", "SemEstoque" } }),
	Vencido(new java.lang.String[][] { new java.lang.String[] { "en_US", "Vencido" } }),
	Ok(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ok" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_Produtos(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
