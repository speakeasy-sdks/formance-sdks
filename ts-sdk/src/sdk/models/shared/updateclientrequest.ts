import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


export class UpdateClientRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "description" })
  description?: string;

  @SpeakeasyMetadata()
  @Expose({ name: "metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata()
  @Expose({ name: "name" })
  name: string;

  @SpeakeasyMetadata()
  @Expose({ name: "postLogoutRedirectUris" })
  postLogoutRedirectUris?: string[];

  @SpeakeasyMetadata()
  @Expose({ name: "public" })
  public?: boolean;

  @SpeakeasyMetadata()
  @Expose({ name: "redirectUris" })
  redirectUris?: string[];

  @SpeakeasyMetadata()
  @Expose({ name: "trusted" })
  trusted?: boolean;
}