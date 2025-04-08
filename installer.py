import platform

if not platform.system() == "Windows":
  print("The installer isnt supported on your os yet! To get the service, install the manual way")
  exit()

print("hi")