.class Lorg/pornaway/ui/WhitelistFragment$1$1;
.super Ljava/lang/Object;
.source "WhitelistFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/pornaway/ui/WhitelistFragment$1;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/pornaway/ui/WhitelistFragment$1;


# direct methods
.method constructor <init>(Lorg/pornaway/ui/WhitelistFragment$1;)V
    .registers 2
    .param p1, "this$1"    # Lorg/pornaway/ui/WhitelistFragment$1;

    .prologue
    .line 160
    iput-object p1, p0, Lorg/pornaway/ui/WhitelistFragment$1$1;->this$1:Lorg/pornaway/ui/WhitelistFragment$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 3
    .param p1, "dlg"    # Landroid/content/DialogInterface;
    .param p2, "sum"    # I

    .prologue
    .line 162
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 163
    return-void
.end method
