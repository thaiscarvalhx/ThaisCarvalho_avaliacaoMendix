// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the MyFirstModule module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder defineImageBuilder(
		myfirstmodule.proxies.Produtos _produtos
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.DefineImage");
		builder = builder.withParam("Produtos", _produtos);
		return builder;
	}

	public static void defineImage(
		IContext context,
		myfirstmodule.proxies.Produtos _produtos
	)
	{
		defineImageBuilder(
				_produtos
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder deleteProdutoBuilder(
		system.proxies.HttpResponse _httpResponse,
		system.proxies.HttpRequest _httpRequest,
		java.lang.String _nomeProduto
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.DeleteProduto");
		builder = builder.withParam("httpResponse", _httpResponse);
		builder = builder.withParam("HttpRequest", _httpRequest);
		builder = builder.withParam("nomeProduto", _nomeProduto);
		return builder;
	}

	public static void deleteProduto(
		IContext context,
		system.proxies.HttpResponse _httpResponse,
		system.proxies.HttpRequest _httpRequest,
		java.lang.String _nomeProduto
	)
	{
		deleteProdutoBuilder(
				_httpResponse,
				_httpRequest,
				_nomeProduto
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder getProdutoBuilder(
		system.proxies.HttpResponse _httpResponse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.GetProduto");
		builder = builder.withParam("httpResponse", _httpResponse);
		return builder;
	}

	public static void getProduto(
		IContext context,
		system.proxies.HttpResponse _httpResponse
	)
	{
		getProdutoBuilder(
				_httpResponse
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder postProdutoBuilder(
		system.proxies.HttpResponse _httpResponse,
		myfirstmodule.proxies.Produtos _produto,
		system.proxies.HttpRequest _httpRequest
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.PostProduto");
		builder = builder.withParam("httpResponse", _httpResponse);
		builder = builder.withParam("Produto", _produto);
		builder = builder.withParam("HttpRequest", _httpRequest);
		return builder;
	}

	public static void postProduto(
		IContext context,
		system.proxies.HttpResponse _httpResponse,
		myfirstmodule.proxies.Produtos _produto,
		system.proxies.HttpRequest _httpRequest
	)
	{
		postProdutoBuilder(
				_httpResponse,
				_produto,
				_httpRequest
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder putProdutoBuilder(
		system.proxies.HttpResponse _httpResponse,
		myfirstmodule.proxies.Produtos _produto,
		system.proxies.HttpRequest _httpRequest
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.PutProduto");
		builder = builder.withParam("httpResponse", _httpResponse);
		builder = builder.withParam("Produto", _produto);
		builder = builder.withParam("HttpRequest", _httpRequest);
		return builder;
	}

	public static void putProduto(
		IContext context,
		system.proxies.HttpResponse _httpResponse,
		myfirstmodule.proxies.Produtos _produto,
		system.proxies.HttpRequest _httpRequest
	)
	{
		putProdutoBuilder(
				_httpResponse,
				_produto,
				_httpRequest
			)
			.execute(context);
	}
}
