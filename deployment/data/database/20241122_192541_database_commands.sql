CREATE TABLE "myfirstmodule$produtos" (
	"id" BIGINT NOT NULL,
	"nm_produto" VARCHAR_IGNORECASE(200) NULL,
	"ds_produto" VARCHAR_IGNORECASE(200) NULL,
	"qt_estoque" INT NULL,
	"vl_preco" DECIMAL(28, 8) NULL,
	"dt_validade" TIMESTAMP NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('61bb26d6-4526-48b9-981f-f44f4f8b8761', 'MyFirstModule.Produtos', 'myfirstmodule$produtos', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('81d28d44-191f-48ac-9459-f1645e9bedfd', '61bb26d6-4526-48b9-981f-f44f4f8b8761', 'NM_Produto', 'nm_produto', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('e9809ca2-dc80-486b-9180-a7318d06e01b', '61bb26d6-4526-48b9-981f-f44f4f8b8761', 'DS_Produto', 'ds_produto', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('ff47e886-39db-427c-8c84-eee497a183fa', '61bb26d6-4526-48b9-981f-f44f4f8b8761', 'QT_Estoque', 'qt_estoque', 3, 0, '0', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('6b388335-3144-4bc1-9974-ac27eec2a122', '61bb26d6-4526-48b9-981f-f44f4f8b8761', 'VL_Preco', 'vl_preco', 5, 0, '0', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('4d0d4703-94fd-4a9e-871c-40d8cadbb62e', '61bb26d6-4526-48b9-981f-f44f4f8b8761', 'DT_Validade', 'dt_validade', 20, 0, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241122 19:25:41';
