ALTER TABLE "myfirstmodule$produtos" DROP COLUMN "imagedescription";
ALTER TABLE "myfirstmodule$produtos" ADD "image" VARCHAR_IGNORECASE(10) NULL;
UPDATE "myfirstmodule$produtos" SET "image" = 'Ok';
DELETE FROM "mendixsystem$attribute"  WHERE "id" = '5f5aacbd-0857-4d90-aa09-122659088a9d';
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('d1895998-19fb-42c3-8a0d-3b4658011226', '61bb26d6-4526-48b9-981f-f44f4f8b8761', 'Image', 'image', 40, 10, 'Ok', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241122 20:15:39';
